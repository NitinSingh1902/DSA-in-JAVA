class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int mProfit=0, minPrice=prices[0];
       for(int j=1;j<n;j++)
       {
        if(prices[j]-minPrice>mProfit)
               mProfit = prices[j]-minPrice;
        if(prices[j]<minPrice)
            minPrice=prices[j];
       }
       return mProfit;
    }
}