package builder;

public abstract class HouseBuilder {

    House house;

    void createHouse() {
        house = new House();
    }

    abstract void buildPrice();

    abstract void buildNumberOfFloors();

    abstract void buildMaterial();

    House getHouse(){
        return house;
    }
}
