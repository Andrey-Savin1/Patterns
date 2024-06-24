package builder;

public class HouseBuildRunner {

    public static void main(String[] args) {

        BuilderMaster builderMaster = new BuilderMaster();

        builderMaster.setBuilder(new WodHouseBuilder());
        House house = builderMaster.buildHouse();

        System.out.println(house);

    }
}
