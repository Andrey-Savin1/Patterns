package abstractFactory;

import abstractFactory.routeToKazan.RouteToKazanTeam;

public class StrawberriesToKazan {

    public static void main(String[] args) {
        RouteTeamFactory routeTeamFactory = new RouteToKazanTeam();
        Driver driver = routeTeamFactory.getDriver();
        Mechanic mechanic = routeTeamFactory.getMechanic();
        Logistician logistician = routeTeamFactory.getLogistician();

        System.out.println("Выезжаем в Казань");
        driver.driveCar();
        mechanic.repairCar();
        logistician.buildsARoute();
    }

}
