package module4;

public class StaticExample {
        static int count = 0;
        static void display() {
            System.out.println("Static Method Called");     }
        public static void main(String[] args) {
            display();
            System.out.println(count);
        }
    }


