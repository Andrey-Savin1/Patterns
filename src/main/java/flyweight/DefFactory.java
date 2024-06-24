package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DefFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDevBySpecialty(String specialty){

        Developer developer = developers.get(specialty);

        if(developer == null){
            switch (specialty) {
                case "java" -> {
                    System.out.println("������ ����� ������������");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("������ �++ ������������");
                    developer = new CppDeveloper();
                }
            }
            developers.put(specialty, developer);
        }

        return developer;

    }
}
