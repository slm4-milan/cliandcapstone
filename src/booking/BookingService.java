package booking;

import car.Car;
import car.CarService;
import user.User;
import user.UserService;

import java.util.Arrays;
import java.util.UUID;

public class BookingService {
    private BookingDao bookingDao;
    private UserService userService;
    private CarService carService;


    public BookingService() {
        this.bookingDao = new BookingDao();
        this.userService = new UserService();
        this.carService = new CarService();
    }


    public void addBooking(String userId, String regNumber) {
        UUID bookingId = UUID.randomUUID();
        User userBooking = null;
        Car carBooking = null;

        User[] users = userService.getAllUsers();
        for (User user : users) {
            if (user.getId().toString().equals(userId)) {
                userBooking = user;
            }
        }
        Car[] cars = carService.getAllAvailableCars();
        System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            if (car.isAvailable() && (car.getRegNumber().equals(regNumber))) {
                car.setAvailable(false);
                car.setBooked(true);
                carBooking = car;
            }
        }
        System.out.println("carBooking: " + carBooking);
        Booking booking = new Booking(bookingId, carBooking, userBooking);
        bookingDao.save(booking);
    }

    public Booking[] getAllBookings() {
        return bookingDao.getAllBookings();
    }


}
