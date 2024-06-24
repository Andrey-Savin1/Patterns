package command;

public class Driver {

    Command firstGear;
    Command secondGear;
    Command thirdGear;
    Command fourthGear;

    public Driver(Command firstGear, Command secondGear, Command thirdGear, Command fourthGear) {
        this.firstGear = firstGear;
        this.secondGear = secondGear;
        this.thirdGear = thirdGear;
        this.fourthGear = fourthGear;
    }

    public void first(){
        firstGear.execute();
    }

    public void second(){
        secondGear.execute();
    }

    public void third(){
        thirdGear.execute();
    }

    public void fourth(){
        fourthGear.execute();
    }
}
