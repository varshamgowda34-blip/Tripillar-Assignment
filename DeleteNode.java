package assignment4.module10;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        Node4 head = new Node4(10);
        head.next = new Node4(20);
        head.next.next = new Node4(30);

        int value = 20;

        if (head.data == value) {
            head = head.next;
        } else {
            Node4 temp = head;
            while (temp.next != null && temp.next.data != value) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
