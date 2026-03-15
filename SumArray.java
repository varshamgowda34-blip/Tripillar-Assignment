package module6;

public class SumArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("Sum = " + sum);
    }
}
