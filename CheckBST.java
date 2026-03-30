package assignment5.module13;

import com.advanced.dsa.dataStructures.nonLinear.trees.problems.diameter.Node;

public class CheckBST {
    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
