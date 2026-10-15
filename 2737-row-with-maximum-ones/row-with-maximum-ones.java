class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        int n = mat.length;
        int m = mat[0].length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    count++;
            }

            if (count > max) {
                max = count;
                arr[0] = i;
                arr[1] = count;
            }
        }

        return arr;
    }
}