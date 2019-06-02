import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combination(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtracking(res, new ArrayList<Integer>(), 1, n, k);
        return res;
    }
    private void backtracking(List<List<Integer>> res, List<Integer> temp, int start, int n, int k) {
        if(k==0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<=n;i++) {
            temp.add(i);
            backtracking(res, temp, i+1, n, k-1);
            temp.remove(temp.size()-1);
        }
    }
}
