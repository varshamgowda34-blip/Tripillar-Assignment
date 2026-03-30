package assignment5.module13;

import com.advanced.dsa.dataStructures.nonLinear.trees.problems.diameter.Node;

public class InsertBST {
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);

        System.out.println("Inserted");
    }
}
