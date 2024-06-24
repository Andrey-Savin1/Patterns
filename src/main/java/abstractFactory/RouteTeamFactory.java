package abstractFactory;

//������� ������������ ������� ��� ��������
public interface RouteTeamFactory {

    Driver getDriver();
    Mechanic getMechanic();
    Logistician getLogistician();

}
