package iterator;

public class AreaRunner {
    public static void main(String[] args) {

        String [] area = {"Превый район", "Второй район", "Третий район"};

        City city = new City("Сочи", area);

        Iterator iterator = city.getIterator();
        System.out.println("Город: " + city.getName());
        System.out.println("Район: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
