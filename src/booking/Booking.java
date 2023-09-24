package booking;

import car.Car;
import user.User;

import java.util.Objects;
import java.util.UUID;

public class Booking {
    private UUID bookingId;
    private Car car;
    private User user;

    public Booking(UUID bookingId, Car car, User user) {
        this.bookingId = bookingId;
        this.car = car;
        this.user = user;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, car, user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId) && Objects.equals(car, booking.car) && Objects.equals(user, booking.user);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", car=" + car +
                ", user=" + user +
                '}';
    }
}
