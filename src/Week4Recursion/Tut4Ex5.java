package Week4Recursion;

public class Tut4Ex5 {
    public static void main(String[] args) {
        // Compute x^n
        System.out.println(xExp(3, 3));

        // Sum of linked list
        MyList list = new MyList(0);
        for (int i = 1; i < 10; i++) {
            list.appendNode(new Node(i));
        }

        // Print integer in binary form
        int2bin(122);
        System.out.println();

        // Compute m(i)
        System.out.println(sumSeq(4));
    }

    // Compute x^n
    private static int xExp(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * xExp(x, n - 1);
        }
    }

    // Sum of linked list
//    private static int sumSLL(MyList list) {
//
//    }

    // Print binary
    private static void int2bin(int i) {
        if (i < 2) {
            System.out.print(i);
        } else {
            int2bin(i / 2);
            System.out.print(i % 2);
        }
    }

    // Compute m(i)
    private static double sumSeq(int i) {
        if (i == 0) {
            return 0;
        } else {
            return (double)i/((2 * i + 1)) +  sumSeq(i - 1);
        }
    }
}
