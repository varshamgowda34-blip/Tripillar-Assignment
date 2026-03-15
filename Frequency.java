package module8;

public class Frequency {
    public static void main(String[] args) {
        String s = "hello";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'l')
                count++;
        }

        System.out.println(count);
    }
}
