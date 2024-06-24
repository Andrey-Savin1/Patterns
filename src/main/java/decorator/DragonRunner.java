package decorator;

public class DragonRunner {

    public static void main(String[] args) {

        Dragon dragon =  new FlyingDragon(new FireDragon(new LittleDragon()));
        System.out.println(dragon.walk());

    }
}
