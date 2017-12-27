// Write the following methods that take two strings as arguments, then return the following information:
// a) Length of each string
// b) Number of upper case characters and lowercase characters in each string
// c) Sum of all digits appeared in each string (i.e. print 10 for string “asxasd5asdfa3ZxC11sdf”)
// d) The concatenated String if two strings are different, or first string if two strings are identical.

package Week9_PatternMatch;

import java.util.Arrays;

public class Tut9Ex1 {
    public static void main(String[] args) {
        String str1 = "Hello 4 hello 2";
        String str2 = "Tell me 2 what yu 6 want rite now";

        System.out.println(Arrays.toString(length(str1, str2)));
        System.out.println(Arrays.toString(lowerAndUpper(str1, str2)));
        System.out.println(Arrays.toString(sumDigit(str1, str2)));
        System.out.println(concatOrFirst(str1, str2));
    }

    // Length of each string
    private static int[] length(String str1, String str2) {
        return new int[] {str1.length(), str2.length()};
    }

    // Number of lowercase and uppercase letter
    private static int[] lowerAndUpper(String str1, String str2) {
        int lower1 = 0, upper1 = 0;
        int lower2 = 0, upper2 = 0;

        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (i < str1.length()) {
                if (Character.toString(str1.charAt(i)).matches("[a-z]"))
                    lower1++;
                if (Character.toString(str1.charAt(i)).matches("[A-Z]"))
                    upper1++;
            }

            if (i < str2.length()) {
                if (Character.toString(str2.charAt(i)).matches("[a-z]"))
                    lower2++;
                if (Character.toString(str2.charAt(i)).matches("[A-Z]"))
                    upper2++;
            }
        }

        return new int[] {lower1, upper1, lower2, upper2};
    }

    // Sum of all digits
    private static int[] sumDigit(String str1, String str2) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (i < str1.length()) {
                if (Character.toString(str1.charAt(i)).matches("[0-9]"))
                    sum1 += Integer.parseInt(Character.toString(str1.charAt(i)));
            }

            if (i < str2.length()) {
                if (Character.toString(str2.charAt(i)).matches("[0-9]"))
                    sum2 += Integer.parseInt(Character.toString(str2.charAt(i)));
            }
        }

        return new int[] {sum1, sum2};
    }

    // Concatenate or first string
    private static String concatOrFirst(String str1, String str2) {
        if (str1.equals(str2))
            return str1;
        else
            return str1 + str2;
    }
}
