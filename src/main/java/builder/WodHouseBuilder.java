package builder;

public class WodHouseBuilder extends HouseBuilder{
    @Override
    void buildPrice() {
        house.setPrice(200);
    }

    @Override
    void buildNumberOfFloors() {
        house.setNumberOfFloors(2);
    }

    @Override
    void buildMaterial() {
        house.setMaterial(Material.WOOD);
    }
}
