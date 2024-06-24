package facade;

public class Weather {

    private boolean weather;

    public boolean isSunShining(){
        return weather;
    }

    public void sun(){
        System.out.println("Светит солнце");
        weather = true;
    }

    public void rain(){
        System.out.println("Идет дождь");
        weather = false;

    }
}
