package proxy;

public class BigORunner {
    public static void main(String[] args) {

        BigObject bigObject = new BigOProxy();

        bigObject.process();
        bigObject.process();


    }
}
