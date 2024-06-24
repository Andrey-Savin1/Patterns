package abstractFactory.routeToKazan;

import abstractFactory.Driver;

public class DriverToKazan implements Driver {

    @Override
    public void driveCar() {
        System.out.println("Веду машину в Казань");
    }
}
