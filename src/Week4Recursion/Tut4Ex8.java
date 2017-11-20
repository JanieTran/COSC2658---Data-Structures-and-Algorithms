// Rewrite the recursive version of maximum contiguous subsequence sum example to
// return the indices identifying the corresponding subsequence.

package Week4Recursion;

public class Tut4Ex8 {

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4,9,8};
        System.out.println(maxSubsequenceSum(arr));
    }

    public static int maxSubsequenceSum( int[] a ) { // D&C maximum contiguous subsequence sum algorithm
        return a.length > 0 ? maxSumRec( a, 0, a.length - 1 ) : 0;
    }

    private static int maxSumRec( int[] a, int left, int right ) {
        int maxLeftBorderSum = 0, maxRightBorderSum = 0;
        int leftBorderSum = 0, rightBorderSum = 0;
        int center = (left + right) / 2;

        // Base case
        if (left == right)
            return a[left] > 0 ? a[left] : 0;

        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        // First half
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[ i ];
            if ( leftBorderSum > maxLeftBorderSum ) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        // Second half
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[ i ];
            if ( rightBorderSum > maxRightBorderSum ) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        int tmp = maxLeftSum > maxRightSum? maxLeftSum : maxRightSum;
        tmp = tmp > (maxLeftBorderSum + maxRightBorderSum)? tmp : (maxLeftBorderSum + maxRightBorderSum);
        return tmp;
    }
}
