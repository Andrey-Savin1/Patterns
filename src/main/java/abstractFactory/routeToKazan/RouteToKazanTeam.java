package abstractFactory.routeToKazan;

import abstractFactory.Driver;
import abstractFactory.Logistician;
import abstractFactory.Mechanic;
import abstractFactory.RouteTeamFactory;

public class RouteToKazanTeam implements RouteTeamFactory {
    @Override
    public Driver getDriver() {
        return new DriverToKazan();
    }

    @Override
    public Mechanic getMechanic() {
        return new MechanicToKazan();
    }

    @Override
    public Logistician getLogistician() {
        return new LogisticianToKazan();
    }
}
