import java.util.ArrayList;
import java.util.List;

public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n*n; ++i) {
            temp.add(i);
        }
        int row_begin = 0;
        int col_begin = 0;
        int row_number = res.length - 1;
        int col_number = res[0].length - 1;
        int idx = 0;
        while (row_begin <= row_number && col_begin <= col_number) {
            /* traverse right */
            for (int j = col_begin; j <= col_number; j++) {
                res[row_begin][j] = temp.get(idx++);
            }
            row_begin ++;
            /* traverse down */
            for (int j = row_begin; j <= row_number; j++) {
                res[j][col_number] = temp.get(idx++);
            }
            col_number --;
            /* traverse left */
            if (row_begin <= row_number) {
                for (int j = col_number; j >= col_begin; j --) {
                    res[row_number][j] = temp.get(idx++);
                }
            }
            row_number --;
            /* traverse up */
            if (col_begin <= col_number) {
                for (int j = row_number; j >= row_begin; j--) {
                    res[j][col_begin] = temp.get(idx++);
                }
            }
            col_begin ++;
        }
        return res;
    }
}
