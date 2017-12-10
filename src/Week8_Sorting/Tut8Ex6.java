//  An array contains N numbers, and you want to determine whether two of the numbers sum to a given number K.
// For instance, if the input is 8, 4, 1, 6 and K is 10, the answer is yes (4 and 6). A number may be used twice.

package Week8_Sorting;

public class Tut8Ex6 {
    public static void main(String[] args) {
        int[] arr = {8, 0, 1, 6};
        System.out.println(oN2(arr, 10));
    }

    public static boolean oN2(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 0) {
                    if (arr[i] == target)
                        return true;
                } else if (arr[i] == 0) {
                    if (arr[j] == target)
                        return true;
                } else {
                    if (((target - arr[i]) % arr[j] == 0) || ((target - arr[j]) % arr[i] == 0))
                        return true;
                }
            }
        }

        return false;
    }
}
