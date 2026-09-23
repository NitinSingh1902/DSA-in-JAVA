class Solution {
    public int lengthOfLastWord(String s) {
        char[] Array = s.toCharArray();
        int n=Array.length;
        int count=0;
        int i=n-1;
        while(i>=0)
        {
            if(Array[i]==' ')
            {
              i--;
            }
            else
            {
                count++; 
                i--;
                if(i >= 0 && Array[i] == ' ')
                {
                  break;
                }   
            }
                 
        }
        return count;
    }
}