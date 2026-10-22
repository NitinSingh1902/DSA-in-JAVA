class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
         char[] arr = command.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='G')
                 s.append("G");
            else if(arr[i]=='(' && arr[i+1]==')')
                 s.append("o");
            else if(arr[i]=='(' && arr[i+3]==')')
                s.append("al");
        }
        return s.toString();
    }
}