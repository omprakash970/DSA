import java.util.*;
import java.Comparator;
public class Indiancoins {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 790;

        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        List<Integer> usedCoins = new ArrayList<>();

        for (int coin : coins) {
            while (coin <= amount) {
                amount -= coin;
                count++;
                usedCoins.add(coin);
            }
            if (amount == 0) break;
        }

        System.out.println("Used coins: " + usedCoins);
        System.out.println("Total coins: " + count);
        if (amount > 0) System.out.println("Remaining amount: " + amount);
    }
}

