// Rewrite Fibonacci example using dynamic programming but keep the recursive form.

package Week4_Recursion;

public class Tut4Ex6 {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    private static int fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
