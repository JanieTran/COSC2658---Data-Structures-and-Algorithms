package Week5TreeHeap;

public class BTNode {
    BTNode parent, left, right;
    int data;

    // Constructor
    public BTNode(int x) {
        parent = left = right = null;
        data = x;
    }
}
