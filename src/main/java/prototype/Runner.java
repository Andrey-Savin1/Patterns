package prototype;

public class Runner {

    public static void main(String[] args) {

        //Создали прототип строителя
        BuildMan buildMan = new HouseBuildMan("Jack");

        //склонировали нашего строителя
        BuildMan cloneBuildMan = buildMan.clone();

        //присвоили ему новое имя
        cloneBuildMan.setName("Max");

        System.out.println(buildMan.getName());
        System.out.println(cloneBuildMan.getName());

    }
}
