import java.util.ArrayList;
import java.util.List;

public class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(n < 1 || k < 1 || k > n) {
            return result;
        }
        List<Integer> curPath = new ArrayList<>();
        dfs(n, k, curPath, 1, result);
        return result;
    }

    private void dfs(int n, int k, List<Integer> curPath, int start, List<List<Integer>> result) {
        if(k == curPath.size() && n == 0) {
            result.add(new ArrayList<Integer>(curPath));
            return;
        }
        if (n < 0) {
            return;
        }

        for(int i = start; i <= 9; ++i) {
            curPath.add(i);
            dfs(n - i, k, curPath, i+1, result);
            curPath.remove(curPath.size() - 1);
        }
    }
}
