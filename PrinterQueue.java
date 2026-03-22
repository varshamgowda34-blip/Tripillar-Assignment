package assignment4.module11;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("File1");
        q.add("File2");

        while (!q.isEmpty()) {
            System.out.println("Printing " + q.poll());
        }
    }
}