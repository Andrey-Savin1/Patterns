package builder;

public class BrickHouseBuilder extends HouseBuilder{
    @Override
    void buildPrice() {
        house.setPrice(1000);
    }

    @Override
    void buildNumberOfFloors() {
        house.setNumberOfFloors(5);
    }

    @Override
    void buildMaterial() {
        house.setMaterial(Material.BRICK);
    }
}
