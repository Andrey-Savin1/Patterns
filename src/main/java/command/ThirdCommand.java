package command;

public class ThirdCommand implements Command {
    Car car;

    public ThirdCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.thirdGear();
    }
}
