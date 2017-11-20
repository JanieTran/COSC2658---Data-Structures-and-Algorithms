// Rewrite make change example to return full list of coins for the change.

package Week4Recursion;

import java.util.Arrays;

public class Tut4Ex7 {
    public static void main(String[] args) {
        int[] coins = {1,5,10,25};
        int change = 63;

        System.out.println(Arrays.toString(makeChange(coins, change)));
    }

    public static int[] makeChange(int [] coins, int change) {
        int[] coinsUsed = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == change) {
                coinsUsed[i] = 1;
                return coinsUsed;
            }
        }

        for (int i = coins.length - 1; i >= 0; i--) {
            if (change > coins[i]) {
                coinsUsed[i] = change / coins[i];
                change = change % coins[i];
            }
        }

        return coinsUsed;
    }
}
