package decorator;

public class DragonDecorator implements Dragon{

    Dragon dragon;

    public DragonDecorator(Dragon dragon) {
        this.dragon = dragon;
    }

    @Override
    public String walk() {
        return dragon.walk();
    }
}
