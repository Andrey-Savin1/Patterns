package visitor;

public class Junior implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("������ �������������� �����");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("������ ����");
    }
}
