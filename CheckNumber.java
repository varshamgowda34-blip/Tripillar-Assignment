package tripillarassignment;

public class CheckNumber {

    static void check(int n) {

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        check(5);
    }
}