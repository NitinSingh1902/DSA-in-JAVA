class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
       k=k%n;
      int i=0,j=n-1,l=0,m=k-1,o=k,q=n-1;
   if(k<n){
      while(i<j)
      {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
      }
       while(l<=m)
      {
         int t=nums[l];
        nums[l]=nums[m];
        nums[m]=t;
        l++;
        m--;
      } 
      while(o<q)
      {
         int p=nums[o];
        nums[o]=nums[q];
        nums[q]=p;
        o++;
        q--;
      }
   }
     
    }
}