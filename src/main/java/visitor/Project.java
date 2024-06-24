package visitor;

public class Project implements ElementProject{

    ElementProject [] elementProjects;

    public Project() {
        this.elementProjects = new ElementProject[]{
                new ProjectClass(),
                new DataBase()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (var e: elementProjects ) {
            e.beWritten(developer);
        }
    }
}
