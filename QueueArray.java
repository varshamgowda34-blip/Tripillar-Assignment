package assignment4.module11;

public class QueueArray {
    int[] queue = new int[5];
    int front = 0, rear = 0;

    void enqueue(int x) {
        queue[rear++] = x;
    }

    void dequeue() {
        System.out.println(queue[front++]);
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
