package tripillarassignment;

public class Employee {

    private String name;   // Private variable (Data Hiding)

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Ayush");
        System.out.println(e.getName());
    }
}