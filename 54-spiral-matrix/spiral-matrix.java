class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr= new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0,er=m-1;
        int sc=0,ec=n-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                arr.add(matrix[sr][i]);
            }
            sr++;
              for(int i=sr;i<=er;i++)
            {
                arr.add(matrix[i][ec]);
            }
            ec--;

            if(sr<=er){
              for(int i=ec;i>=sc;i--)
            {
                arr.add(matrix[er][i]);
            }
            er--;
            }

            if(sc<=ec){
              for(int i=er;i>=sr;i--)
            {
                arr.add(matrix[i][sc]);
            }
            sc++;
            }
        }
        return arr;
    }
}