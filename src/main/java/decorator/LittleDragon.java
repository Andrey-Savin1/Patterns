package decorator;

public class LittleDragon implements Dragon {
    @Override
    public String walk() {
        return "Дракон ходит.";
    }
}
