package factory;

public class DriverCategoryBFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new DriverCategoryB();
    }
}
