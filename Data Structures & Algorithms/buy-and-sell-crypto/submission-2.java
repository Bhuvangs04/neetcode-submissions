class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;

        for(int i=0;i<prices.length;i++){
            int buy = prices[i];
            for(int j= i+1;j<prices.length;j++){
                int sell = prices[j];
                max_profit = Math.max(max_profit,sell - buy);
            }
            
        }
        return max_profit;
        
    }
}
