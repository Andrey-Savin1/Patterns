package composite;

import java.util.ArrayList;
import java.util.List;

public class Herbivores {

    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void eatGrass() {
        System.out.println("�������� ������...");
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
