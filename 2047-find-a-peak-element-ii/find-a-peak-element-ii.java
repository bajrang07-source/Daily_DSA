class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

//-------       APPROACH 1      ------

        // int max = Integer.MIN_VALUE;
        // int[] ans = new int[2];
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < col; j++) {
        //         if(max < mat[i][j]) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             max = mat[i][j];
        //         }
        //     }
        // }
        // return ans;

//-------       APPROACH 2      ------

        int left = 0;
        int right = col-1;

        int[] ans = new int[2];

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < row; i++) {
                if(max < mat[i][mid]) {
                    max = mat[i][mid];
                    ans[0] = i;
                    ans[1] = mid;
                }
            }

            int leftVal = (mid == 0) ? Integer.MIN_VALUE : mat[ans[0]][mid-1];
            int rightVal = (mid == col-1) ? Integer.MIN_VALUE : mat[ans[0]][mid+1];

            if(max < rightVal) {
                left = mid + 1;
            }
            else if(max < leftVal) {
                right = mid - 1;
            }
            else {
                return ans;
            }
        }
        return new int[]{-1, -1};
    }
}