public class Person implements Comparable{
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() { return name; }

    public void display(){
        System.out.println("Name: "+name);
    }

    @Override
    public int compareTo(Object a) {
        Person tmp = (Person)a;
        return name.compareToIgnoreCase( tmp.getName());
    }
}
