package assignment4.module10;

class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountNodes {
    public static void main(String[] args) {
        Node5 head = new Node5(10);
        head.next = new Node5(20);
        head.next.next = new Node5(30);

        int count = 0;
        Node5 temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Number of nodes: " + count);
    }
}