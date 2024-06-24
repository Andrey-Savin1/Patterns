package prototype;

public class HouseBuildMan implements BuildMan {

    private String name;

    public HouseBuildMan(String name) {
        this.name = name;
    }

    public BuildMan clone(){
        return new HouseBuildMan(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
