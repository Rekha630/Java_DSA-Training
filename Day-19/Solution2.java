class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue=prices[i];
            }else{
                int cur = prices[i]-minValue;
                profit=Math.max(profit,cur);   
            }
        }
        return profit;
    }
}
