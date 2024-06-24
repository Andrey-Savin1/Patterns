package visitor;

public class DataBase implements ElementProject{


    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
