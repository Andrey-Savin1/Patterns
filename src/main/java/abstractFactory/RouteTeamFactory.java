package abstractFactory;

//Фабрика возвращающая команду для маршрута
public interface RouteTeamFactory {

    Driver getDriver();
    Mechanic getMechanic();
    Logistician getLogistician();

}
