package iterator;

public class AreaRunner {
    public static void main(String[] args) {

        String [] area = {"������ �����", "������ �����", "������ �����"};

        City city = new City("����", area);

        Iterator iterator = city.getIterator();
        System.out.println("�����: " + city.getName());
        System.out.println("�����: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
