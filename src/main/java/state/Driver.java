package state;

public class Driver {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

   public void changeActivity(){
        if (activity instanceof Driving){
            setActivity(new Eating());
        }else if (activity instanceof Eating){
            setActivity(new Sleaping());
        }else if (activity instanceof Sleaping){
           setActivity(new Driving());
       }
   }

   public void justDoIt(){
        activity.justDoIt();
   }

}
