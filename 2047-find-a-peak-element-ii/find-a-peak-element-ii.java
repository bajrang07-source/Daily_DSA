class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(max < mat[i][j]) {
                    ans[0] = i;
                    ans[1] = j;
                    max = mat[i][j];
                }
            }
        }
        return ans;
    }
}