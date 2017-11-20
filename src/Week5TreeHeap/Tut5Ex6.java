package Week5TreeHeap;

import java.util.LinkedList;
import java.util.Queue;

public class Tut5Ex6 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(24);
        tree.insert(12);
        tree.insert(7);
        tree.insert(20);
        tree.insert(18);
        tree.insert(16);
        tree.insert(11);
        tree.insert(8);

        treeDetails(tree);
    }

    public static void treeDetails(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int countEven = 0;
        int sum = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();

            // Count number of even values
            if (node.data % 2 == 0) countEven ++;

            // Sum of all values
            sum += node.data;

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        System.out.println("Even value: " + countEven);
        System.out.println("Sum: " + sum);
    }
}
