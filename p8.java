public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit=prices[i]-bp;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                bp=prices[i];
            }
        }
        return maxProfit;
        
    }