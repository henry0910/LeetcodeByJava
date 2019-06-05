import java.util.ArrayList;
import java.util.List;

public class Solution74 {
    // binary search
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int rowLen = matrix.length;
        int columnLen = matrix[0].length;
        int row = rowLen - 1, column = 0;
        while (row >= 0 && column < columnLen) {
            if (matrix[row][column] == target) {
                return true;
            }
            if (matrix[row][column] > target) {
                if (column != 0) {
                    return false;
                }
                row--;
            } else {
                column++;
            }

        }
        return false;
    }
    // naive approach
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix == null || matrix.length == 0) return false;
//        for (int i = 0; i < matrix.length; ++i) {
//            for (int j = 0; j < matrix[0].length; ++j) {
//                if (matrix[i][j] == target) return true;
//            }
//        }
//        return false;
//    }
}
