package car;


import java.util.Arrays;

public class CarDao {
    private static final Car[] cars;

    static {
        cars = new Car[]{
                new Car("1234", false, false, true, Brand.BMW),
                new Car("1287", false, true, true, Brand.MERCEDES),
                new Car("6483", false, false, true, Brand.MERCEDES),
        };
    }

    public Car[] getAllAvailableCars() {
        int counter = 0;
        Car[] availableCars;
        for (Car car : cars
        ) {
            if (car.isAvailable()) {
                counter++;
            }
        }

        availableCars = new Car[counter];
        int isAvailableCounter = 0;
        for (Car car :
                cars) {
            if (car.isAvailable()) {
                availableCars[isAvailableCounter] = car;
                ++isAvailableCounter;

            }
        }
        return availableCars;
    }

    public Car[] getAllAvailableElectricCars() {
        int counter = 0;
        Car[] availableElectricCars;
        for (Car car : cars) {
            if (car.isAvailable() && car.isElectric()) {
                counter++;
            }
        }

        availableElectricCars = new Car[counter];
        int iselectricCarAvailableCounter = 0;
        for (Car car : cars) {
            if (car.isAvailable() && car.isElectric()) {
                availableElectricCars[iselectricCarAvailableCounter] = car;
                ++iselectricCarAvailableCounter;

            }
        }
        return availableElectricCars;
    }
}
