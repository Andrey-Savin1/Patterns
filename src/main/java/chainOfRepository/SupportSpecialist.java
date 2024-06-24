package chainOfRepository;

public class SupportSpecialist extends Handler{

    public SupportSpecialist(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Это специалист технической поддержки: " + message);
    }
}
