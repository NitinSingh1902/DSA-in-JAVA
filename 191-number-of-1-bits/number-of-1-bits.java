class Solution {
    public int hammingWeight(int n) {
        int[] arr= new int[31];
        int i=30,count=0;
        while(n>0)
        {
          
                  arr[i]=n%2;
                 n=n/2;
            
            
            i--;
        }
        for(int j=0;j<31;j++)
        {
            if(arr[j]==1)
               count++;
        }
        return count;
    }
}