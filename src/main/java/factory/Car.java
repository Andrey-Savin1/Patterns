package factory;

//У нас есть машина (Газель). И нам понадобилось, чтоб водители с разными категориями могли ездить на ней.
public class Car {

    public static void main(String[] args) {
        DriverFactory driverFactory = createDriverByCategory("B");
        Driver driver = driverFactory.createDriver();
        driver.driveCar();
    }

    static DriverFactory createDriverByCategory(String category){
        if (category.equalsIgnoreCase("C")){
            return new DriverCategoryCFactory();
        }else if (category.equalsIgnoreCase("B")){
            return new DriverCategoryBFactory();
        }else {
            throw new RuntimeException(category + " нет водителя с такой катгорией");
        }
    }
}
