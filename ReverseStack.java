package assignment4.module11;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
