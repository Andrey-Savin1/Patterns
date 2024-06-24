package factory;

public class DriverCategoryCFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new DriverCategoryC();
    }
}
