package module8;

public class SetBits {
    public static void main(String[] args) {
        int n = 5, count = 0;

        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println(count);
    }
}
