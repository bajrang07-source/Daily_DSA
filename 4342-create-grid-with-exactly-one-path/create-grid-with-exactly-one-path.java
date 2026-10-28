class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        StringBuilder row = new StringBuilder(".");
        for (int j = 1; j < n; j++) {
            row.append("#");
        }

        StringBuilder lastRow = new StringBuilder();
        for (int j = 0; j < n; j++) {
            lastRow.append(".");
        }
        for (int i = 0; i < m - 1; i++) {
            grid[i] = row.toString();
        }
        grid[m - 1] = lastRow.toString();

        return grid;
    }
}