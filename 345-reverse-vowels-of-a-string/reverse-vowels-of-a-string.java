class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j)
        {
            if((arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')  &&  (arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U' || arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' ) )
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
           else if((arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')  &&  (arr[j]!='A' || arr[j]!='E' || arr[j]!='I' || arr[j]!='O' || arr[j]!='U' || arr[j]!='a' || arr[j]!='e' || arr[j]!='i' || arr[j]!='o' || arr[j]!='u' ))
           {
            j--;
           }
           else{
            i++;
           }
        }
        String str = new String(arr);
        return str;
    }
}