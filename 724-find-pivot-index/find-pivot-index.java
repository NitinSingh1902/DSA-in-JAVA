class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tsum=0,sum2=0;
        int lsum=0,rsum;
          for(int i=0;i<n;i++)
        { 
          tsum=tsum+nums[i];  
        }
        for(int i=0;i<n;i++)
        {
            rsum=tsum-lsum-nums[i];
            if(lsum==rsum)
            {
              return i;
            }
             lsum=lsum+nums[i];   
        }
        
        return -1; 
    }
}