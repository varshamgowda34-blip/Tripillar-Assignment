package assignment4.module9;

public class MazePath {
    static void path(int i, int j, int n, int m, String ans) {
        if (i == n - 1 && j == m - 1) {
            System.out.println(ans);
            return;
        }
        if (i < n - 1) path(i + 1, j, n, m, ans + "D");
        if (j < m - 1) path(i, j + 1, n, m, ans + "R");
    }

    public static void main(String[] args) {
        path(0, 0, 2, 2, "");
    }
}
