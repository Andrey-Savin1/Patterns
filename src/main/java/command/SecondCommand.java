package command;

public class SecondCommand implements Command{

    Car car;

    public SecondCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.secondGear();
    }
}
