package facade;

public class TrekFacade {

    Driver driver = new Driver();
    Weather weather = new Weather();

    public void drive(){
        weather.sun();
        driver.drive(weather);
    }
}
