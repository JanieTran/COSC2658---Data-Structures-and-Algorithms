package Week5TreeHeap;

import java.util.LinkedList;
import java.util.Queue;

public class Tut5Ex6 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        int[] values = {10,12,1,14,6,5,8,15,3,9};
        boolean insertSuccess;

        for (int i = 0; i < values.length; i++) {
            insertSuccess = tree.insert(values[i]);
        }

        System.out.println("Even value: " + evenValue(tree));
        System.out.println("Sum: " + treeSum(tree));
        System.out.println("Longest increasing sequence including root: " + lenRootIncreasingSeq(tree));
        System.out.println("Longest increasing sequence excluding root: " + lenIncreasingSeq(tree.root));
    }

    // Count event values
    public static int evenValue(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int countEven = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();

            // Count number of even values
            if (node.data % 2 == 0) countEven ++;

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return countEven;
    }

    // Sum of all nodes
    public static int treeSum(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int sum = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();

            // Sum of all values
            sum += node.data;

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return sum;
    }

    // Length of longest increasing sequence excluding rort
    public static int lenIncreasingSeq(BTNode root) {
        if (root == null) return 0;
        else {
            int lenLeft = lenIncreasingSeq(root.left);
            int lenRight = lenIncreasingSeq(root.right);
            lenRight++;
            return lenLeft > lenRight ? lenLeft : lenRight;
        }
    }

    // Length of longest increasing sequence including root
    public static int lenRootIncreasingSeq(BTree tree) {
        BTNode node = tree.root;
        int count = 0;

        while (node != null) {
            node = node.right;
            count ++;
        }

        return count;
    }
}
