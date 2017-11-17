package Week4;

public class Tut4Ex7 {
    public static void main(String[] args) {
        int[] coins = {1,5,10,25};
    }

    public static int makeChange(int [] coins, int change) {
        int minCoins = change;

        for (int i = 0; i < coins.length; i++)
            if (coins[i] == change )
                return 1;

        for (int j = 1; j <= change / 2; j++) {
            int thisCoins = makeChange(coins, j) + makeChange(coins, change-j);
            if (thisCoins < minCoins)
                minCoins = thisCoins;
        }

        return minCoins;
    }
}
