package Week5TreeHeap;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
    BTNode root;
    int size;

    // CONSTRUCTOR
    public BTree() {
        root = null;
        size = 0;
    }

    // METHODS

    public boolean insert(int value) {
        if (root == null) root = new BTNode(value);
        else {
            BTNode parent = null, current = root;
            while (current != null) {
                if (value < current.data) {
                    parent = current;
                    current = current.left;
                } else if (value > current.data) {
                    parent = current;
                    current = current.right;
                } else return false;
            }

            if (value < parent.data) {
                parent.left = new BTNode(value);
                parent.left.parent = parent;
            } else {
                parent.right = new BTNode(value);
                parent.right.parent = parent;
            }
        }

        size ++;
        return true;
    }

    // Remove leaves or node with 1 child
    private void splice(BTNode node) {
        BTNode s, p;
        if (node.left != null) s = node.left;
        else s = node.right;

        if (node == root) {
            root = s;
            p = null;
        } else {
            p = node.parent;
            if (p.left == node) p.left = s;
            else p.right = s;
        }

        if (s != null) s.parent = p;
        size --;
    }

    // Remove node with 2 children
    public void remove(BTNode node) {
        if (node.left == null || node.right == null)
            splice(node);
        else {
            BTNode w = node.right;
            while (w.left != null)
                w = w.left;

            node.data = w.data;
            splice(w);
        }
    }

    public BTNode find(int x) {
        BTNode node = root;
        while (node != null) {
            if (x < node.data) node = node.left;
            else if (x > node.data) node = node.right;
            else return node;
        }
        return null;
    }

    // TRAVERSALS

    // Pre-order
    public void traversePreorder() {
        System.out.print("Pre-order traversal: ");
        preorder(root);
        System.out.println();
    }

    private void preorder(BTNode node) {
        if (node != null) {
            System.out.print(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    // In-order
    public void traverseInorder() {
        System.out.print("In-order traversal: ");
        inorder(root);
        System.out.println();
    }

    private void inorder(BTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data);
            inorder(node.right);
        }
    }

    // Post-order
    public void traversePostorder() {
        System.out.print("Post-order traversal: ");
        postorder(root);
        System.out.println();
    }

    private void postorder(BTNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data);
        }
    }

    // Breadth-first
    public void traverseBreadthfirst() {
        System.out.println("Breadth-first traversal: ");
        Queue<BTNode> q = new LinkedList<>();

        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            BTNode node = q.remove();
            System.out.println(node.data);
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
