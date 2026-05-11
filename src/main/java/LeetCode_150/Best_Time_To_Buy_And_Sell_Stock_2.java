package LeetCode_150;

public class Best_Time_To_Buy_And_Sell_Stock_2 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        Best_Time_To_Buy_And_Sell_Stock_Solution_2 bestTimeToBuyAndSellStockSolution = new Best_Time_To_Buy_And_Sell_Stock_Solution_2();
        System.out.println(bestTimeToBuyAndSellStockSolution.maxProfit(prices));

    }
}

class Best_Time_To_Buy_And_Sell_Stock_Solution_2{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyer = prices[0];
        int len = prices.length;

        for(int i=1; i<len ;i++){

            int sell = prices[i];
            if(minBuyer < sell){
                maxProfit = Math.max(maxProfit,sell-minBuyer);
            }
            minBuyer = Math.min(minBuyer,sell);
        }
        return maxProfit;
    }
}