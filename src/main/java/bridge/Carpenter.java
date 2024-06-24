package bridge;
//Столяр
public class Carpenter implements Builder{

    @Override
    public void build() {
        System.out.println("Будем строить из дерева");
    }
}
