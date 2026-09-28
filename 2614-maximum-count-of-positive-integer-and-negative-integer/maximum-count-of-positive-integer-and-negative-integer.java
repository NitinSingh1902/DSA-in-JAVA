class Solution {
    public int maximumCount(int[] nums) {
        int ncount=0,pcount=0;
        for(int i=0 ;i < nums.length;i++)
        {
            if(nums[i]>0)
            {
                pcount++;
            }
            if(nums[i]<0)
            {
                ncount++;
            }
        }
        if(pcount>ncount)
            return pcount;
        else
            return ncount;
    }
}