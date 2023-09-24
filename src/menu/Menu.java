package menu;

import booking.Booking;
import booking.BookingService;
import car.Car;
import car.CarService;
import user.User;
import user.UserService;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {

        CarService carService = new CarService();
        UserService userService = new UserService();
        BookingService bookingService = new BookingService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Book Car");
        System.out.println("2 - View All User Booked Cars");
        System.out.println("3 - View All Bookings");
        System.out.println("4 - View Available Cars");
        System.out.println("5 - View Available Electric Cars");
        System.out.println("6 - View all users");
        System.out.println("7 - Exit");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                System.out.println("Book car");
                System.out.println("Cars available for booking:");
                Car[] allAvailableCars = carService.getAllAvailableCars();
                for (Car car : allAvailableCars) {
                    System.out.println(car);
                }
                System.out.println("Select car registration number");
                String regNumber = scanner.nextLine();
                User[] allUsers = userService.getAllUsers();
                for (User user : allUsers) {
                    System.out.println(user);
                }
                System.out.println("Select user id");
                String userId = scanner.nextLine();
                bookingService.addBooking(userId, regNumber);
                Booking[] allBookings = bookingService.getAllBookings();
                for (Booking booking : allBookings) {
                    System.out.println(booking);
                }
                displayMenu();
                break;
            case "2":
                System.out.println("View All User Booked Cars");

                displayMenu();
                break;
            case "3":
                System.out.println("View all bookings");
                allBookings = bookingService.getAllBookings();
                for (Booking booking : allBookings) {
                    System.out.println(booking);
                }
                displayMenu();
                break;
            case "4":
                System.out.println("View Available Cars");
                allAvailableCars = carService.getAllAvailableCars();
                for (Car car : allAvailableCars) {
                    System.out.println(car);
                }
                displayMenu();
                break;
            case "5":
                System.out.println("View Available Electric Cars");
                Car[] allAvailableElectricCars = carService.getAllAvailableElectricCars();
                for (Car car : allAvailableElectricCars) {
                    System.out.println(car);
                }
                displayMenu();
                break;
            case "6":
                System.out.println("View all users");
                allUsers = userService.getAllUsers();
                for (User user : allUsers) {
                    System.out.println(user);
                }
                displayMenu();
                break;
            case "7":
                System.out.println("Closing application...");
                break;
            default:
                System.out.println("Input number from 0-7");
                displayMenu();

        }
    }
}
