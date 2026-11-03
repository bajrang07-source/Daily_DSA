class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i++) {
            int left = 0;
            int right = col-1;

            while(left <= right) {
                int mid = (left + right) / 2;

                if(matrix[i][mid] < target) {
                    left = mid+1;
                }
                else if(matrix[i][mid] > target) {
                    right = mid-1;
                }
                else {
                    return true;
                }
            }
        }
        return false;
    }
}