package module6;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 20, 5, 8};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}