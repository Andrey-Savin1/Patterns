package adapter;

public class ChargeAdapter extends ChargingAndroid implements ChargingIphone{

    @Override
    public void chargIphone() {
        chargeAndroid();
    }
}
