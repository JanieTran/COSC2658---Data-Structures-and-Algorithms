package Week4;

public class Tut4Ex2 {
    public static void main(String[] args) {
        System.out.println(sum_int(-5));
    }

    public static int sum_int(int n) {
        int sum = 0;

        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return sum_int(n - 1) + n;
        }
    }
}
