package command;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Driver driver = new Driver(
                new FirstCommand(car),
                new SecondCommand(car),
                new ThirdCommand(car),
                new FourthCommand(car)
        );

        driver.first();
        driver.second();
        driver.third();
        driver.fourth();

    }
}
