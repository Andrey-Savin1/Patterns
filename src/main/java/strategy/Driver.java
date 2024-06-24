package strategy;

import state.Activity;

public class Driver {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

   public void executeActivity(){
     activity.justDoIt();
   }

   public void justDoIt(){
        activity.justDoIt();
   }

}
