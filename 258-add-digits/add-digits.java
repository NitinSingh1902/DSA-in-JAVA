class Solution {
    public int addDigits(int num) {
        int sum1=0,sum2=0,sum3=0;
           while(num>0)
           {
            int r=num%10;
            sum1=sum1+r;
            num=num/10;
            }
        
         while(sum1>0)
        {
            int r=sum1%10;
             sum2=sum2+r;
             sum1=sum1/10;
        }
         while(sum2>0)
        {
            int r=sum2%10;
             sum3=sum3+r;
             sum2=sum2/10;
        }

        return sum3;
        
    }
}