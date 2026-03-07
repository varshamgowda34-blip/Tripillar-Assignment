package tripillarassignment;

class Student {

    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Varsha";
        s.marks = 95;

        s.display();
    }
}