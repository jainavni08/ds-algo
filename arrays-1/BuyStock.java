import java.util.Scanner;

    class Solution {
        public static int maxProfit(int[] prices) {
           int current_profit = 0;
           int min_price = prices[0];
           int max_profit = 0;
           for(int i = 1; i < prices.length;i++){
            current_profit = prices[i] - min_price;
            max_profit = Math.max(max_profit,current_profit);
            min_price = Math.min(min_price,prices[i]);
           }
           return max_profit;
    }
    public static void main(String []args){
        int[] stock = {7,1,4,3,5};
       
        System.out.println(maxProfit(stock));
    }
    }

