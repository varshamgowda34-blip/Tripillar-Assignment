package assignment5.module13;

import com.advanced.dsa.dataStructures.nonLinear.trees.problems.diameter.Node;

public class SearchBST {
    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println(search(root, 30));
    }
}
