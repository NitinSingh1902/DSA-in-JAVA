class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        int s=0;
        int e=nums.length-1;
       for(int i=0 ; i< nums.length;i++)
       {
        if(nums[i]==target)
             arr.add(i);
       }
        return arr;
    }
}