package Week5_Tree_Heap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Tut5Ex5 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        Random rand  = new Random();

        for (int i = 0; i < 20; i++) {
            tree.insert(rand.nextInt(20));
        }

        System.out.println(treeNodesCount(tree));
        System.out.println(treeLeavesCount(tree));
        System.out.println(rightChildCount(tree));
        System.out.println(treeHeight(tree));
        treeClear(tree);
        System.out.println(treeNodesCount(tree));
    }

    // Count number of nodes
    private static int treeNodesCount(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int count = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();
            count ++;
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return count;
    }

    // Count number of leaves
    private static int treeLeavesCount(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int count = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
            if (node.left == null && node.right == null) count ++;
        }

        return count;
    }

    // Count number of right children
    private static int rightChildCount(BTree tree) {
        Queue<BTNode> q = new LinkedList<>();
        int count = 0;

        if (tree.root != null) q.add(tree.root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();
            if (node.left != null) q.add(node.left);
            if (node.right != null) {
                q.add(node.right);
                count ++;
            }
        }

        return count;
    }

    // Calculate height
    private static int treeHeight(BTree tree) {
        return findHeight(tree.root);
    }

    private static int findHeight(BTNode node) {
        if (node == null) return -1;
        return 1 + (findHeight(node.left) > findHeight(node.right) ? findHeight(node.left) : findHeight(node.right));
    }

    // Remove all nodes
    private static void treeClear(BTree tree) {
        tree.root = null;
    }
}
