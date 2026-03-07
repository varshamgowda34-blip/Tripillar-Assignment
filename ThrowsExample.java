package module5;

public class ThrowsExample {
    static void divide() throws
            ArithmeticException {
        int x = 10 / 0;
        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

