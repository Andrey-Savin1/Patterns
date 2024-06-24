package abstractFactory;

import abstractFactory.routeToMoscow.RouteToMoscowTeam;

public class AppleToMoskow {
    public static void main(String[] args) {
        RouteTeamFactory routeTeamFactory = new RouteToMoscowTeam();
        Driver driver = routeTeamFactory.getDriver();
        Mechanic mechanic = routeTeamFactory.getMechanic();
        Logistician logistician = routeTeamFactory.getLogistician();

        System.out.println("Выезжаем в Москву");
        driver.driveCar();
        mechanic.repairCar();
        logistician.buildsARoute();
    }
}
