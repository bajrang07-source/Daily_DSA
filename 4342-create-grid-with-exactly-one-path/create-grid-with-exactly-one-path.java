class Solution {
    public String[] createGrid(int m, int n) {
        int row = m;
        int col = n;

        String[] grid = new String[row];
        // if(m == 1) {
        //     String temp = "";
        //     for(int i = 0; i < col; i++) {
        //         temp += ".";
        //     }
        //     grid[0] = temp;
        //     return grid;
        // }
        
        for(int i = 0; i < row-1; i++) {
            String temp = ".";
            for(int j = 1; j < col; j++) {
                temp += "#";
            }
            grid[i] = temp;
        }

        String temp2 = "";
        for(int i = 0; i < col; i++) {
            temp2 += ".";
        }
        grid[row-1] = temp2;
        return grid;
    }
}