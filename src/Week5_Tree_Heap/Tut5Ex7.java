package Week5_Tree_Heap;

public class Tut5Ex7 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        int[] values = {10,12,1,14,6,5,8,15,3,9};
        boolean insertSuccess;

        for (int i = 0; i < values.length; i++) {
            insertSuccess = tree.insert(values[i]);
        }
    }

    private static boolean isBalanced(BTree tree) {
        BTNode node = tree.root;

        while (node != null) {
            if (Math.abs(nodeHeightLeft(node) - nodeHeightRight(node)) > 1)
                return false;
        }

        return true;
    }

    private static int nodeHeightLeft(BTNode node) {
        if (node == null) return 0;
        else {
            int heightLeft = nodeHeightLeft(node.left);
            heightLeft ++;
            return heightLeft;
        }
    }

    private static int nodeHeightRight(BTNode node) {
        if (node == null) return 0;
        else {
            int heightRight = nodeHeightRight(node.right);
            heightRight ++;
            return heightRight;
        }
    }

}
