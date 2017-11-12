// Compute (manually) gcd(1995, 1492)

package Week4;

public class Tut4Ex3 {
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
