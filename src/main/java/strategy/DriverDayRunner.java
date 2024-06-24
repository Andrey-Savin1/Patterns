package strategy;

public class DriverDayRunner {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setActivity(new Driving());
        driver.justDoIt();

        driver.setActivity(new Eating());
        driver.justDoIt();

        driver.setActivity(new Sleaping());
        driver.justDoIt();

        driver.setActivity(new Driving());
        driver.justDoIt();

    }

}
