import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        int row_begin = 0;
        int col_begin = 0;
        int row_number = matrix.length - 1;
        int col_number = matrix[0].length - 1;
        while (row_begin <= row_number && col_begin <= col_number) {
            /* traverse right */
            for (int j = col_begin; j <= col_number; j++) {
                res.add(matrix[row_begin][j]);
            }
            row_begin ++;
            /* traverse down */
            for (int j = row_begin; j <= row_number; j++) {
                res.add(matrix[j][col_number]);
            }
            col_number --;
            /* traverse left */
            if (row_begin <= row_number) {
                for (int j = col_number; j >= col_begin; j --) {
                    res.add(matrix[row_number][j]);
                }
            }
            row_number --;
            /* traverse up */
            if (col_begin <= col_number) {
                for (int j = row_number; j >= row_begin; j--) {
                    res.add(matrix[j][col_begin]);
                }
            }
            col_begin ++;
        }
        return res;

    }
}
