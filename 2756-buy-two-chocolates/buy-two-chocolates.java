class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length,sum=0,p=money;
        sum=prices[0]+prices[1];
       
      if(sum<=money)
      {
        return money-sum;
      }
         
         return money;
    }
}