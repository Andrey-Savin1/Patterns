package builder;

public class House {

    private int price;
    private int numberOfFloors;
    private Material material;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "HouseBuilder{" +
                "price=" + price +
                ", numberOfFloors=" + numberOfFloors +
                ", material=" + material +
                '}';
    }
}
