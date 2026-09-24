class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            if(nums[j]-nums[i]>max)
            {
                 max=nums[j]-nums[i];
            }

        }
        return max;
    }
}