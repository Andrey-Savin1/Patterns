package flyweight;

import java.util.ArrayList;
import java.util.List;

public class DeveloperRunner {
    public static void main(String[] args) {

        DefFactory defFactory = new DefFactory();

        List<Developer> devs = new ArrayList<>();

       devs.add(defFactory.getDevBySpecialty("java"));
       devs.add(defFactory.getDevBySpecialty("java"));
       devs.add(defFactory.getDevBySpecialty("c++"));
       devs.add(defFactory.getDevBySpecialty("c++"));
       devs.add(defFactory.getDevBySpecialty("c++"));


        for (var d :devs ) {
            d.writeCode();
        }
    }
}
