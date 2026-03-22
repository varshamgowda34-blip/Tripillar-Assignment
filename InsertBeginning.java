package assignment4.module10;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertBeginning {
    public static void main(String[] args) {
        Node2 head = new Node2(20);
        head.next = new Node2(30);

        Node2 newNode = new Node2(10);
        newNode.next = head;
        head = newNode;

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
