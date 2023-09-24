package booking;

import car.Brand;
import car.Car;
import user.User;

import java.util.UUID;

public class BookingDao {
    static Booking[] bookings = new Booking[2];

    public void save(Booking booking) {
        bookings[0] = booking;
    }

    public Booking[] getAllBookings() {
        return bookings;
    }
}
