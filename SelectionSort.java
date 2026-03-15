package module7;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22};

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
