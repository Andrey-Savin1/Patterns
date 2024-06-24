package visitor;

public class ProjectClass implements ElementProject{




    @Override
    public void beWritten(Developer developer) {
            developer.create(this);
    }
}
