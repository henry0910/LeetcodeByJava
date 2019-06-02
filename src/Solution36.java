import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution36 {
    public boolean isValidSudoka(char[][] board) {
        // check row first //
        for (int r = 0; r < 9; ++r) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int c = 0; c < 9; ++c) {
                if (row.contains(board[r][c]) || col.contains(board[c][r]) || cube.contains(board[r/3*3 + c/3][(r%3)*3 + c%3]))
                    return false;
                if (board[r][c] != '.') row.add(board[r][c]);
                if (board[c][r] != '.') col.add(board[c][r]);
                if (board[r/3*3 + c/3][(r%3)*3 + c%3] != '.')
                    cube.add(board[r/3*3 + c/3][(r%3)*3 + c%3]);
            }
        }
        return true;
    }
}
