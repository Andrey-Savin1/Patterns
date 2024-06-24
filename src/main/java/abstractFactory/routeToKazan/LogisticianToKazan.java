package abstractFactory.routeToKazan;

import abstractFactory.Logistician;

public class LogisticianToKazan implements Logistician {

    @Override
    public void buildsARoute() {
        System.out.println("Прокладываю маршрут до Казани");
    }
}
