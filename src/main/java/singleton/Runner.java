package singleton;

public class Runner {

    public static void main(String[] args) {

        //�������� ������ �������
        System.out.println(new Horse());
        System.out.println(new Horse());
        System.out.println(new Horse());

        //�������� ���� � ��� �� ������
        System.out.println(Horse.horse().toString());
        System.out.println(Horse.horse().toString());
        System.out.println(Horse.horse().toString());

    }

}
