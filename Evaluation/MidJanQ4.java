import java.util.*;

class CoinsCombinations{
    public int coinsCount(int[] coins,int amount){
        int count = 0,temp = 0,sum = amount;
        for(int i=0; i<coins.length-1;i++){
            for(int j=i+1;j<coins.length;j++)
            if(coins[i] < coins[j]){
                temp = coins[i];
                coins[i] = coins[j];
                coins[j] = temp;
            }
        }
        for(int i=0; i<coins.length; i++){
            while(sum > coins[i]){
                sum -= coins[i];
                count++; 
            }
            if(sum == coins[i])
                return ++count;
        }
        return -1;
    }
}

public class MidJanQ4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CoinsCombinations coin = new CoinsCombinations();
        System.out.println("Total Amount of Money :- ");
        int amount = input.nextInt();
        System.out.println("Number of Denominations :- ");
        int row = input.nextInt();
        System.out.println("Enter the Numbers :- ");
        int[] coins = new int[row];
        for(int i=0; i< row; i++)
            coins[i] = input.nextInt();

        System.out.print(coin.coinsCount(coins, amount));    
    }
}