class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

//--------------       APPROACH 1       ----------------

        // int[][] newMatrix = new int[n][m];

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         newMatrix[j][n-i-1] = matrix[i][j];
        //     }
        // }

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         matrix[i][j] = newMatrix[i][j];
        //     }
        // }

//------------       APPROACH 2       -----------------

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i != j && j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            int x = 0;
            int y = matrix[i].length - 1;
            while(x <= y) {
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;
                x++;
                y--;
            }
        }
    }
}