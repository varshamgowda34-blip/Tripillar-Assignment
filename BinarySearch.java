package module7;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int key = 7;
        int l = 0, r = a.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == key) {
                System.out.println("Found");
                break;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    }
}
