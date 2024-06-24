package adapter;

public class ChargeRunner {
    public static void main(String[] args) {
        ChargingIphone chargingIphone = new ChargeAdapter () ;

        chargingIphone.chargIphone();
    }
}
