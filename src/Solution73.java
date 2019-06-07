import java.util.HashSet;
import java.util.Set;

public class Solution73 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    if (!row.contains(i)) row.add(i);
                    if (!col.contains(j)) col.add(j);
                }
            }
        }
        for (Integer i : row) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) continue;
                else matrix[i][j] = 0;
            }
        }
        for (Integer i : col) {
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[j][i] == 0) continue;
                else matrix[j][i] = 0;
            }
        }
    }
}
