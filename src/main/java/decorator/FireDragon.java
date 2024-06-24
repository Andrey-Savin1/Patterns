package decorator;

public class FireDragon extends DragonDecorator{


    public FireDragon(Dragon dragon) {
        super(dragon);
    }


    public String breatheFire() {
        return " ����� �����! ";
    }

    @Override
    public String walk() {
        return super.walk() + breatheFire();
    }
}
