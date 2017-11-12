// Write a recursive mathematical definition for computing 2n for a positive integer n.

package Week4;

public class Tut4Ex4 {
    public static void main(String[] args) {
        System.out.println(twoExp(10));
    }

    private static int twoExp(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 * twoExp(n - 1);
        }
    }
}
