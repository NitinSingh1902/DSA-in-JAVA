class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean a=true,d=true;
      for(int i=1;i<n;i++)
      {
        if(nums[i]>nums[i-1])
              d=false;
        
        if(nums[i]<nums[i-1])
              a=false;

      }
        if(a == true || d == true)
        {
            return true;
        }
             
        return false;

    }
}