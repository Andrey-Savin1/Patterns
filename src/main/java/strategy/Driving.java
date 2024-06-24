package strategy;

import state.Activity;

public class Driving implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("водитель едет");
    }
}
