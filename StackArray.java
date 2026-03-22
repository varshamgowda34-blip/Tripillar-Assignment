package assignment4.module11;

public class StackArray {
    int[] stack = new int[5];
    int top = -1;

    void push(int x) {
        stack[++top] = x;
    }

    void pop() {
        System.out.println(stack[top--]);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.pop();
    }
}
