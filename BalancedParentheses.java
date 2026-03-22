package assignment4.module11;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "(){}[]";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (!stack.isEmpty())
                stack.pop();
        }

        System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced");
    }
}