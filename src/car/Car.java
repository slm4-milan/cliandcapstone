package car;

import java.util.Objects;

public class Car {
    private String regNumber;
    private boolean isBooked;
    private boolean isElectric;
    private boolean isAvailable;
    private Brand brand;

    public Car() {
    }

    public Car(String regNumber, boolean isBooked, boolean isElectric, boolean isAvailable, Brand brand) {
        this.regNumber = regNumber;
        this.isBooked = isBooked;
        this.isElectric = isElectric;
        this.isAvailable = isAvailable;
        this.brand = brand;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, isBooked, isElectric, isAvailable, brand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isBooked == car.isBooked && isElectric == car.isElectric && isAvailable == car.isAvailable && Objects.equals(regNumber, car.regNumber) && brand == car.brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", isBooked=" + isBooked +
                ", isElectric=" + isElectric +
                ", isAvailable=" + isAvailable +
                ", brand=" + brand +
                '}';
    }
}
