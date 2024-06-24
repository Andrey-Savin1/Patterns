package abstractFactory.routeToMoscow;

import abstractFactory.Driver;
import abstractFactory.Logistician;
import abstractFactory.Mechanic;
import abstractFactory.RouteTeamFactory;

public class RouteToMoscowTeam implements RouteTeamFactory {
    @Override
    public Driver getDriver() {
        return new DriverToMoscow();
    }

    @Override
    public Mechanic getMechanic() {
        return new MechanicToMoscow();
    }

    @Override
    public Logistician getLogistician() {
        return new LogisticianToMoscow();
    }
}
