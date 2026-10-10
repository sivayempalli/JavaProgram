package LeetCode_150.Arrays_And_Sorting;

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
        int currentProfit = 0;
        int minBuyer = prices[0];
        int sell = prices[0];
        int len = prices.length;

        for(int i=1; i<len ;i++){
           // sell = prices[i];
            if( sell < prices[i]){
                sell = prices[i];
                currentProfit = Math.max(maxProfit,sell-minBuyer);
            }else{
                minBuyer = prices[i];
                maxProfit += currentProfit;
                currentProfit = 0;
            }
        }

        if(currentProfit > 0){
            maxProfit += currentProfit;
        }
        return maxProfit;
    }
}