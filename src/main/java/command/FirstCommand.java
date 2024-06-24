package command;

public class FirstCommand implements Command{

    Car car;

    public FirstCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.firstGear();
    }
}
