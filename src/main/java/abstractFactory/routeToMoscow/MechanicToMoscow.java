package abstractFactory.routeToMoscow;

import abstractFactory.Mechanic;

public class MechanicToMoscow implements Mechanic {
    @Override
    public void repairCar() {
        System.out.println("Чиню машину по дороге в Москву");
    }
}
