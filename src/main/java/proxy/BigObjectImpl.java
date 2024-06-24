package proxy;

public class BigObjectImpl implements BigObject{

    public BigObjectImpl(){
        heavyInitialConfig();
    }

    @Override
    public void process() {
        System.out.println("Процесс завершен");
    }

    private void heavyInitialConfig(){
        System.out.println("Загружаю систему");
    }

}
