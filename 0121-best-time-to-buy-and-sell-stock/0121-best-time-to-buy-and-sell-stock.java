class Solution {
     int profit=0;
     int buy=Integer.MAX_VALUE;
     int sell=Integer.MIN_VALUE;

  
    public int maxProfit(int[] prices) {
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
                sell=prices[i];
            }
            else{
                sell=prices[i];
            }
            int maxprofit=sell-buy;
            profit =Math.max(profit,maxprofit);
        }
        return profit;
    }
}