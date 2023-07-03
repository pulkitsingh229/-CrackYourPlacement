class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int profitSum=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit=prices[i]-bp;
                profitSum+=profit;
                bp=prices[i];
            }
            else{
                bp=prices[i];
            }
        }
        return profitSum;
    }
}