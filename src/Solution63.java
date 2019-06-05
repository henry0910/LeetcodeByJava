public class Solution63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0][0] == 1) return 0;
        int row_number = obstacleGrid.length;
        int col_number = obstacleGrid[0].length;
        obstacleGrid[0][0] = 1;
        for (int i = 1; i < row_number; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }
        for (int j = 1; j < col_number; j++) {
            obstacleGrid[0][j] = (obstacleGrid[0][j] == 0 && obstacleGrid[0][j-1] == 1) ? 1 : 0;
        }
        for (int i = 1; i < row_number; i++) {
            for (int j = 1; j < col_number; j++) {
                if (obstacleGrid[i][j] == 0)
                    obstacleGrid[i][j] = obstacleGrid[i][j-1] + obstacleGrid[i-1][j];
                else
                    obstacleGrid[i][j] = 0;
            }
        }
        return obstacleGrid[row_number - 1][col_number - 1];
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int result = uniquePathsWithObstacles(grid);
    }
}
