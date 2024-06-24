package command;

public class FourthCommand implements Command {

    Car car;

    public FourthCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.fourthGear();
    }
}
