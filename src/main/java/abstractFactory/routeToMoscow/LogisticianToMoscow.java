package abstractFactory.routeToMoscow;

import abstractFactory.Logistician;

public class LogisticianToMoscow implements Logistician {

    @Override
    public void buildsARoute() {
        System.out.println("����������� ������� �� ������ � ������");
    }
}
