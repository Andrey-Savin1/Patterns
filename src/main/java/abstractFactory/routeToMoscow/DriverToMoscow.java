package abstractFactory.routeToMoscow;

import abstractFactory.Driver;

public class DriverToMoscow implements Driver {

    @Override
    public void driveCar() {
        System.out.println("Веду машину в Москву ");
    }
}
