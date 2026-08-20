class Solution {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        int n = arr.length;
        int i;
        int[] count= new int[26] ;
        for(i=0;i<n;i++)
        {
            count[arr[i]-'a']++;
        }
         for(i=0;i<n;i++)
        {
            if( count[arr[i]-'a']==1)
                  return i;
        }
        return -1;
    }
}