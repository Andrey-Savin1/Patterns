package facade;

public class Driver extends Weather{

    public void drive(Weather weather){

        if (weather.isSunShining()){
            System.out.println("≈дем по терку");
        }else {
            System.out.println("∆дем солнце");
        }
    }
}
