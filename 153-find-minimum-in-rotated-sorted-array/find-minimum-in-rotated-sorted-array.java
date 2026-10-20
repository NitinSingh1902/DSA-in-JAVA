class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int ans=-1;
        if(nums[0]<nums[n-1])
        {
            return nums[0];
        }
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[n-1])
            {
                i=mid+1;
            }
            else{
                   ans=nums[mid];
                   j=mid-1;
            }
        }
        return ans;
    }
}