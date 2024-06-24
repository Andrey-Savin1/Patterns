package builder;

public class BuilderMaster {

    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse (){
        builder.createHouse();
        builder.buildPrice();
        builder.buildNumberOfFloors();
        builder.buildMaterial();

        House house = builder.getHouse();
        return house;
    }
}
