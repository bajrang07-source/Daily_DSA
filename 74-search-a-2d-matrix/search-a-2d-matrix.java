class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left = 0; 
        int right = row*col-1;
        while(left<=right){
            int mid = (left+right)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(matrix[midRow][midCol]>target){
                right = mid-1;
            }
            else if(matrix[midRow][midCol]<target){
                left = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}