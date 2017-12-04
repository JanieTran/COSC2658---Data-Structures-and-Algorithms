/*
  RMIT University Vietnam
  Course: COSC2658 Data Structures & Algorithms
  Semester: 2017C
  Assignment: 1
  Author: Tran Thi Hong Phuong
  ID: s3623386
  Created date: 13/11/2017
  Acknowledgement:
   - Find all subsets of an array: http://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
   - Stream-based method to convert string to int array: https://stackoverflow.com/questions/8348591/splitting-string-and-put-it-on-int-array
*/

import java.util.Arrays;

public class Combinations {
    public static void printCombinations(int[] arr, int sum) {
        int[] comb;

        for (int i = 0; i < (1 << arr.length); i++) {
            String set = "";
            int tempSum = 0;

            // Finding all subsets of the given array and calculate sum of each subset
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0) {
                    set += arr[j] + " ";
                    tempSum += arr[j];
                }
            }

            // If the sum of the subset equals to the desired sum, print out the subset
            if (tempSum == sum) {
                comb = Arrays.stream(set.split(" ")).mapToInt(Integer::parseInt).toArray();
                Arrays.sort(comb);
                System.out.println(Arrays.toString(comb));
            }
        }
    }

    public static void main(String[] args) {
        // Set 1
        int[] arr1 = {2,7,15,1,8,32};
        System.out.println("Results for set 1:");
        printCombinations(arr1, 10);

        // Set 2
        int[] arr2 = {3,2,5,6,4,1,7};
        System.out.println("Results for set 2:");
        printCombinations(arr2, 12);

        // Set 2
        int[] arr3 = {1,2,3,4,5};
        System.out.println("Results for set 3:");
        printCombinations(arr3, 9);
    }
}
