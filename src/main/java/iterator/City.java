package iterator;

public class City implements Collection{

    private String name;
    private String[] area;

    public City(String name, String[] area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArea() {
        return area;
    }

    public void setArea(String[] area) {
        this.area = area;
    }

    @Override
    public Iterator getIterator() {
        return new AreaIterator();
    }

    private class AreaIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < area.length;
        }

        @Override
        public Object next() {
            return area[index++];
        }
    }

}
