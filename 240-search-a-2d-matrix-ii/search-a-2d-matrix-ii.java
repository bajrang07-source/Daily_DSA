class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        // if(row * col == 1) {
        //     boolean ans = (matrix[row-1][col-1] == target) ? true : false;
        //     return ans;
        // }

//--------       APPROACH 1      -----------

        // for(int i = 0; i < row; i++) {
        //     int left = 0;
        //     int right = col-1;

        //     while(left <= right) {
        //         int mid = (left + right) / 2;

        //         if(matrix[i][mid] < target) {
        //             left = mid+1;
        //         }
        //         else if(matrix[i][mid] > target) {
        //             right = mid-1;
        //         }
        //         else {
        //             return true;
        //         }
        //     }
        // }
        // return false;

//--------       APPROACH 2      -----------

        int currentRow = 0;
        int currentCol = col-1;
        while(currentRow < row && currentCol >= 0) {
            long currentValue = matrix[currentRow][currentCol];

            if(currentValue < target) {
                currentRow++;
            }
            else if(currentValue > target) {
                currentCol--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}