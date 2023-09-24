package car;

public class CarService {
    private CarDao carDao;

    public CarService() {
        this.carDao = new CarDao();
    }

    public Car[] getAllAvailableCars() {
        return carDao.getAllAvailableCars();
    }

    public Car[] getAllAvailableElectricCars() {
        return carDao.getAllAvailableElectricCars();
    }


}
