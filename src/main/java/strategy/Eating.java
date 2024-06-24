package strategy;

import state.Activity;

public class Eating implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Водитель ест");
    }
}
