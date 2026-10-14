class Solution {
    public int singleNonDuplicate(int[] nums) {
    HashMap<Integer , Integer> arr = new HashMap<>();
        for(int n : nums)
        {
          arr.put(n,arr.getOrDefault(n,0)+1);
        }
        for(int i : nums)
        {
            if(arr.get(i)==1)
            {
                return i;
            }
        }
        return -1;
    }
}