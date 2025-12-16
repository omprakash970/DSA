import java.util.ArrayList;
import java.util.Comparator;

public class Indiancoins {
    public static void main(String[] args) {
        Integer[] coins ={1,2,5,10,20,50,100,200,500,2000};
        int amount =790; 
        Arrays.sort(coins, Comparator.reverseOrder());
        int count =0; 
        ArrayList<Integer> usedCoins = new ArrayList<>();
        for(int coin: coins){
            if(coins[i]<=amount){
                while(coin<=amount){
                    amount-=coin; 
                    count++; 
                    usedCoins.add(coin);
                }
            }
        }

         
    }
}
    

