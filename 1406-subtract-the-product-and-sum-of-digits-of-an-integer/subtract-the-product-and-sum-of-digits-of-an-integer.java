class Solution {
    public int subtractProductAndSum(int n) {
      int i,j,sum=0,mul=1;
      int m=n,o=n;
      while(m>0)
      {
        int r=m%10;
        sum=sum+r;
        mul=mul*r;
        m=m/10;
      }      

      int diff=mul-sum;
      return diff;
    }
}