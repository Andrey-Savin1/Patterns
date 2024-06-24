package bridge;
//каменьщик
public class Stonemason implements Builder {

    @Override
    public void build() {
        System.out.println("Будем строить из камня");
    }
}
