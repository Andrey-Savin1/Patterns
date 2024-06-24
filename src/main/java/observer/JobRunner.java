package observer;

public class JobRunner {
    public static void main(String[] args) {

        JobSite jobSite = new JobSite();
        jobSite.addVacancy("first");
        jobSite.addVacancy("second");
        jobSite.addVacancy("third");

        Observer first = new Subscriber("Mike");
        Observer second = new Subscriber("Tom");

        jobSite.addObserver(first);
        jobSite.addObserver(second);

        jobSite.addVacancy("fourth");

        jobSite.removeVacancy("first");
    }
}
