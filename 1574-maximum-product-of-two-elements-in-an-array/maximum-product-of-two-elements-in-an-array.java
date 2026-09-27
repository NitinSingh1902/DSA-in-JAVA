class Solution {
    public int maxProduct(int[] nums) {
        int mul=0;
        Arrays.sort(nums);
        int n=nums.length;
      mul=(nums[n-1]-1)*(nums[n-2]-1);
     return mul; 
    }
}