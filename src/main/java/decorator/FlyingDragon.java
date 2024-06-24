package decorator;

public class FlyingDragon extends DragonDecorator{

    public FlyingDragon(Dragon dragon) {
        super(dragon);
    }

    public String fly(){
        return " ������ ������ ";
    }

    @Override
    public String walk() {
        return super.walk() + fly();
    }
}
