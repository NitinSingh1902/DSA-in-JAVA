class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n : arr)
        {
          freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i]== freq.get(arr[i]) && arr[i]>lucky)
                  lucky=arr[i];
        }
        return lucky;
    }
}