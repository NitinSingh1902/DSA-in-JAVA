class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,r,s=x;
        while(s>0)
        {
            r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(x%sum == 0)
              return sum;
       return -1;
    }
}