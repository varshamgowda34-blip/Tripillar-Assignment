package assignment4.module8;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;

        if ((n & (n - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not power of 2");
    }
}