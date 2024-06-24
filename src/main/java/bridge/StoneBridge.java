package bridge;

public class StoneBridge extends Bridge{

    public StoneBridge(Builder builder) {
        super(builder);
    }

    @Override
    public void buildBridge() {
        System.out.println("��� ���� �� �����");
        builder.build();
    }
}
