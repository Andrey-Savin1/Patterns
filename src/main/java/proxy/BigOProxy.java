package proxy;

public class BigOProxy implements BigObject {

    private static BigObject bigObject;

    @Override
    public void process() {
        if (bigObject == null){
            bigObject = new BigObjectImpl();
        }
        bigObject.process();
    }
}
