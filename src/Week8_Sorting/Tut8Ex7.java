// Write a method of O(N log N) in average case that
// sorts a list of strings base on the first character (case insensitive).

package Week8_Sorting;

import java.util.Arrays;

public class Tut8Ex7 {
    public static void main(String[] args) {
        String[] arr = {"Mianhae Billboard", "Mianhae Worldwide", "Adeuri no jallagaseo mianhae eomma",
                        "When I wake up in my room", "Do you see my bag?", "I need u girl wae",
                        "Oh happy day", "Where are you oh oh oh", "Are you calling me a sinner?"};

        sortStrings(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortStrings(String[] arr) {
        for (String str : arr)
            str.toLowerCase();
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(String[] arr, int low, int high) {
        int mid = (low + high) / 2;

        if (arr[mid].charAt(0) < arr[low].charAt(0))
            swap(arr, low, mid);
        if (arr[high].charAt(0) < arr[low].charAt(0))
            swap(arr, low, high);
        if (arr[high].charAt(0) < arr[mid].charAt(0))
            swap(arr, mid, high);

        swap(arr, mid, high);
        String pivot = arr[high];

        int i, j;
        for (i = low, j = high - 1; ; ) {
            while (arr[i++].charAt(0) < pivot.charAt(0)) {}
            while (pivot.charAt(0) < arr[j--].charAt(0)) {}

            if (i >= j) break;

            swap(arr, i, j);
        }

        swap(arr, i, high);
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);

    }

    public static void swap(String[] arr, int idx1, int idx2) {
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
