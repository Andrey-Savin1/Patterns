package composite;

public class Zoo {

    public static void main(String[] args) {
        //травоядные
        Herbivores herbivores = new Herbivores();

        Animal panda = new Panda();
        Animal zebra = new Zebra();
        Animal giraffe = new Giraffe();

        herbivores.addAnimal(panda);
        herbivores.addAnimal(zebra);
        herbivores.addAnimal(giraffe);

        herbivores.eatGrass();
    }

}
