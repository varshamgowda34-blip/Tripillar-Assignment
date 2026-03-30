package assignment5.module13;

import com.advanced.dsa.dataStructures.nonLinear.trees.problems.diameter.Node;

public class MinMax {
    static int min(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    static int max(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println("Min: " + min(root));
        System.out.println("Max: " + max(root));
    }
}
