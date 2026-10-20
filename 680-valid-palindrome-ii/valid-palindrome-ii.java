class Solution {
    boolean isPal(String s,int i, int j )
    {
         char[] arr = s.toCharArray();
        while(i<j){
           if(arr[i++]!=arr[j--])
                  return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0,j= arr.length-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
                 return isPal(s,i+1,j) || isPal(s,i,j-1);
            i++;
            j--;
                  
        }
         return true;
    }
}