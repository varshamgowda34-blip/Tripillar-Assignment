package assignment4.module8;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is easy";
        String[] words = str.split(" ");

        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }
}
