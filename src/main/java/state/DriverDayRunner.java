package state;

public class DriverDayRunner {

    public static void main(String[] args) {
        Activity activity = new Driving();
        Driver driver = new Driver();

        driver.setActivity(activity);

        for (int i = 0; i < 5; i++) {
                driver.justDoIt();
                driver.changeActivity();
        }
    }



}
