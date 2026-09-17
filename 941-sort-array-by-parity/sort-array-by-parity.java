class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0,j=i+1;
        while(j<n)
        {
            if(nums[i]%2!=0 && nums[j]%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            i++;
            j++;
            }
            else if(nums[i]%2==0 && nums[j]%2!=0 || nums[i]%2==0 && nums[j]%2==0)
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
            
        }
        return nums;
    }
}