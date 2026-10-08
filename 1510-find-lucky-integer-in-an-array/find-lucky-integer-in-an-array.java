class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n : arr)
        {
          freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(int i : arr)
        {
            if(freq.get(i)==i && i>lucky)
                lucky=i;
        }
        return lucky;
    }
}