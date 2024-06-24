package bridge;

public abstract class Bridge  {

    Builder builder;

    public Bridge(Builder builder) {
        this.builder = builder;
    }

    public abstract void buildBridge();
}
