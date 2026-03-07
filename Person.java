package tripillarassignment;
 public class Person {

    String name;

    // Constructor
    Person(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Person p = new Person("Maya");  // Calling constructor
        p.display();
    }
}