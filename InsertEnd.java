package TripillarAssignment4.module10;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertEnd {
    public static void main(String[] args) {
        Node3 head = new Node3(10);
        head.next = new Node3(20);

        Node3 newNode = new Node3(30);

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}