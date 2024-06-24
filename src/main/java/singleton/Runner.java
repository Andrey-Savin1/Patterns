package singleton;

public class Runner {

    public static void main(String[] args) {

        //Получаем разные объекты
        System.out.println(new Horse());
        System.out.println(new Horse());
        System.out.println(new Horse());

        //получаем один и тот же объект
        System.out.println(Horse.horse().toString());
        System.out.println(Horse.horse().toString());
        System.out.println(Horse.horse().toString());

    }

}
