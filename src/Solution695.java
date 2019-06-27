public class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int maxArea = 0;
        int[] count = new int[1];
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == 1) {
                    count[0] = 0;
                    dfs(grid, i, j, row, col, count);
                    maxArea = Math.max(maxArea, count[0]);
                }
            }
        }
        return maxArea;
    }

    private void dfs(int[][] grid, int currRow, int currCol, int rowNumber, int colNumber, int[] count) {
        if (currCol >= colNumber || currRow >= rowNumber || currRow < 0 || currCol < 0 || grid[currRow][currCol] != 1) return;
        grid[currRow][currCol] = -1;
        count[0]++;
        dfs(grid, currRow + 1, currCol, rowNumber, colNumber, count);
        dfs(grid, currRow - 1, currCol, rowNumber, colNumber, count);
        dfs(grid, currRow, currCol + 1, rowNumber, colNumber, count);
        dfs(grid, currRow, currCol - 1, rowNumber, colNumber, count);
    }
}
