package abstractFactory.routeToKazan;

import abstractFactory.Mechanic;

public class MechanicToKazan implements Mechanic {
    @Override
    public void repairCar() {
        System.out.println("���� ������ �� ������ � ������");
    }
}
