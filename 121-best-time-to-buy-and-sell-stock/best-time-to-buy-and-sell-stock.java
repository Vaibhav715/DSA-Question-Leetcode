class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int Max_Profit = 0;
     for(int i = 0; i < prices.length; i++){
        min=Math.min(min, prices[i]);
        Max_Profit = Math.max(Max_Profit, prices[i]-min);
     } 
     return Max_Profit;  
    }
}