class Solution {
    public String removeStars(String s) {
     List<Character> stack= new Stack<>();   
     char[] arr=s.toCharArray();
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]=='*')
           stack.remove(stack.size()-1);
        else
            stack.add(arr[i]);
     }
       StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}