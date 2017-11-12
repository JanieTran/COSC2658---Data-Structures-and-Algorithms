package Week4;

public class Tut4Ex5 {
    public static void main(String[] args) {
        // Compute x^n
        System.out.println(xExp(3, 3));

        // Print integer in binary form
        int2bin(122);
        System.out.println();

        // Compute m(i)
        System.out.println(sumSeq(4));
    }

    private static int xExp(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * xExp(x, n - 1);
        }
    }

    private static void int2bin(int i) {
        if (i < 2) {
            System.out.print(i);
        } else {
            int2bin(i / 2);
            System.out.print(i % 2);
        }
    }

    private static double sumSeq(int i) {
        if (i == 0) {
            return 0;
        } else {
            return (double)i/((2 * i + 1)) +  sumSeq(i - 1);
        }
    }
}
