package prototype;

public class Runner {

    public static void main(String[] args) {

        //������� �������� ���������
        BuildMan buildMan = new HouseBuildMan("Jack");

        //������������ ������ ���������
        BuildMan cloneBuildMan = buildMan.clone();

        //��������� ��� ����� ���
        cloneBuildMan.setName("Max");

        System.out.println(buildMan.getName());
        System.out.println(cloneBuildMan.getName());

    }
}
