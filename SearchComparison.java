package module7;

import java.util.Arrays;

public class SearchComparison {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        int key = 8;

        // Linear Search
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Linear Search: Found at index " + i);
                break;
            }
        }

        // Binary Search
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Binary Search: Found at index " + mid);
                break;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Time Complexity
        System.out.println("Linear Search Time Complexity = O(n)");
        System.out.println("Binary Search Time Complexity = O(log n)");
    }
}
