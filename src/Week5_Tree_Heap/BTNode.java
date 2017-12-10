package Week5_Tree_Heap;

public class BTNode {
    BTNode parent, left, right;
    int data;

    // Constructor
    public BTNode(int x) {
        parent = left = right = null;
        data = x;
    }
}
