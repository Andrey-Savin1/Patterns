package facade;

public class Driver extends Weather{

    public void drive(Weather weather){

        if (weather.isSunShining()){
            System.out.println("���� �� �����");
        }else {
            System.out.println("���� ������");
        }
    }
}
