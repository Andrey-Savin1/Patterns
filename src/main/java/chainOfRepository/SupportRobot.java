package chainOfRepository;

public class SupportRobot extends Handler{


    public SupportRobot(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("��� ����� ����������� ���������: " + message);
    }
}
