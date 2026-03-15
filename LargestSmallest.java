package module6;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] a = {4, 2, 9, 1, 5};
        int max = a[0], min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
