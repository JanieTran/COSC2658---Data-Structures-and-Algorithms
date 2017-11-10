// Implement the following methods, that accept an array of double
// and return the sum, average, and mode (most common item) in the array.

package Week3;

import java.util.Arrays;

public class Tut3Ex3 {

    public static void main(String[] args) {

    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void mode(double[][] arr) {
        double[] number = new double[arr.length * arr[0].length];
        double element;
        int count = 0;

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[0].length; col++) {
//                element = arr[row][col];
//
//                for (int i = 0; i < arr.length; i++) {
//                    for (int j = 0; j < arr[0].length; j++) {
//                        if (arr[i][j] == element) {
//                            count ++;
//                        }
//                    }
//                }
//
//            }
//        }
    }
}
