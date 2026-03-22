package assignment4.module8;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "Hello World".toLowerCase();
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}