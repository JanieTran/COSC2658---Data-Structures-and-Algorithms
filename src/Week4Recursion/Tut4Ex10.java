// Function findMaxAndMin, defined below is intended to
// return (in an array of length 2) the maximum and minimum item
// (if arr.length is 1, the maximum and minimum are the same)
//
// Write an appropriate private static recursive routine to split a problem into roughly two halves,
// but should never split into two odd-sized problems (size 10 is to be split into 4 and 6, rather than 5 and 5).
//
// Reference: https://stackoverflow.com/questions/7320188/divide-and-conquer-algorithms-to-find-the-maximum-element-of-an-array

package Week4Recursion;

import java.util.Arrays;

public class Tut4Ex10 {
    public static void main(String[] args) {
        double[] arr = {5,3,8,4,6,0,3};
        System.out.println(Arrays.toString(findMaxAndMin(arr)));
    }

    private static double[] findMaxAndMin(double[] arr) {
        double[] maxMin = new double[2];
        maxMin[0] = findMax(arr, 0, arr.length);
        maxMin[1] = findMin(arr, 0, arr.length);
        return maxMin;
    }

    private static double findMax(double[] arr, int left, int right) {
        // Base case
        if (right - left == 1) {
            return arr[left];
        }

        // Split in two halves
        int center = (left + right) /2;
        double maxLeft = findMax(arr, left, center);
        double maxRight = findMax(arr, center, right);
        return maxLeft > maxRight ? maxLeft : maxRight;
    }

    private static double findMin(double[] arr, int left, int right) {
        // Base case
        if (right - left == 1) {
            return arr[left];
        }

        // Split in two halves
        int center = (left + right) / 2;
        double minLeft = findMin(arr, left, center);
        double minRight = findMin(arr, center, right);
        return minLeft < minRight ? minLeft : minRight;
    }
}
