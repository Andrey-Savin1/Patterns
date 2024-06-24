package visitor;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        Junior junior = new Junior();
        Senior senior = new Senior();

        System.out.println("Джун работает...");
        project.beWritten(junior);

        System.out.println("====================================");

        System.out.println("Синьор работает...");
        project.beWritten(senior);
    }
}
