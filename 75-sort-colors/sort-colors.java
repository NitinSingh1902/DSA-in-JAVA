class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
         int i=0,j=0,k=n-1;
         while(i<=k)
         {
                if(nums[i]==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j++;
                }
                else if(nums[i]==1)
                   i++;
                else if(nums[i]==2)
                {
                    int p=nums[i];
                    nums[i]=nums[k];
                    nums[k]=p;
                    k--;
                }
          }
    
    }
}