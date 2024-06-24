package memento;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Project project = new Project();

        GitRepo gitRepo = new GitRepo();

        System.out.println("Создали проект. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);
        System.out.println("Сохраняем на гитхаб");

        gitRepo.setSave(project.save());
        System.out.println("Обновление");

        project.setVersionAndDate("Version 1.1");
        Thread.sleep(5000);
        System.out.println(project);

        System.out.println("Что то сломалось");

        System.out.println("откатились на Version 1.0");
        project.load(gitRepo.getSave());

        System.out.println("Информация после отката");
        System.out.println( project);

    }
}
