package chainOfRepository;

public class DeveloperSpecialist extends Handler{

    public DeveloperSpecialist(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Вызываем к вам специалиста: " + message);
    }
}
