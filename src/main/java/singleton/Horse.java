package singleton;

public class Horse {

    private static Horse horse;

    public static Horse horse(){
        if (horse == null){
            horse = new Horse();
        }
    return horse;
    }
}
