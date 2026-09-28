class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

//---------------       APPROACH 1       ------------------

        // int row = 0;
        // int column = 0;

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         list.add(matrix[i][j]);
        //         row = i;
        //         column = j;
        //     }
        //     break;
        // }
        // if(n ==1) return list;
        // row++;
        // while(row < n) {
        //     list.add(matrix[row][column]);
        //     row++;
        // }
        // row--;
        // column--;
        // while(column >= 0) {
        //     list.add(matrix[row][column]);
        //     column--;
        // }
        // row--;
        // column++;
        // while(column < m-1) {
        //     list.add(matrix[row][column]);
        //     column++;
        // }
        // return list;

//------------        APPROACH 2        ---------------

        int left = 0;
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;

        while(top <= bottom && left <= right) {
            //left -> right
            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //top -> bottom
            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            //right -> left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;

            //bottom -> top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}