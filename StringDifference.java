package module4;

public class StringDifference {
         public static void main(String[] args) {
             String s = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");
        sb.append(" World");
        sbf.append(" Java");
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
    }

