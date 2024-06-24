package bridge;

public class BridgeCreator {
    public static void main(String[] args) {
        Bridge [] bridge = {
                new WoodBridge(new Stonemason()),
                new StoneBridge(new Carpenter())
        };

        for (var br: bridge) {
            br.buildBridge();
        }
    }
}
