package bridge;

public class WoodBridge extends Bridge{

    public WoodBridge(Builder builder) {
        super(builder);
    }

    @Override
    public void buildBridge() {
        System.out.println("Это мост из дерева");
        builder.build();
    }
}
