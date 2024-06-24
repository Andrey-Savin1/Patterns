package memento;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Project project = new Project();

        GitRepo gitRepo = new GitRepo();

        System.out.println("������� ������. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);
        System.out.println("��������� �� ������");

        gitRepo.setSave(project.save());
        System.out.println("����������");

        project.setVersionAndDate("Version 1.1");
        Thread.sleep(5000);
        System.out.println(project);

        System.out.println("��� �� ���������");

        System.out.println("���������� �� Version 1.0");
        project.load(gitRepo.getSave());

        System.out.println("���������� ����� ������");
        System.out.println( project);

    }
}
