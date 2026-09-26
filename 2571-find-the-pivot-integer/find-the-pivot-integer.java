class Solution {
    public int pivotInteger(int n) {
        int tsum=0,lsum=0,rsum=0;
      for(int i=1;i<=n;i++)
      {
        tsum=tsum+i;
      }  
       for(int i=1;i<=n;i++)
      {
        rsum=tsum-lsum-i;
        if(lsum==rsum)
        {
            return i;
        }
        lsum=lsum+i;
      }  
      return -1;
    }
}