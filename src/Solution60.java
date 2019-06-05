import java.util.ArrayList;
import java.util.List;

public class Solution60 {
    public String getPermutation(int n, int m) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; ++i) res.add(i);
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = i * fact[i-1];
        }
        m = m - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int index = m / fact[i-1];
            m = m % fact[i-1];
            sb.append(res.get(index));
            res.remove(index);
        }
        return sb.toString();
    }
    // Time limit Approach
//    public String getPermutation(int n, int k) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        int[] target = new int[n];
//        for (int i = 1; i <= n; ++i) target[i-1] = i;
//        boolean[] used = new boolean[n];
//        dfs(res, temp, 0, used, target);
//        List<Integer> permu = res.get(k-1);
//        StringBuilder sb = new StringBuilder();
//        for (Integer i : permu) sb.append(i);
//        return sb.toString();
//    }
//    private void dfs(List<List<Integer>> res, List<Integer> temp, int start, boolean[] used, int[] target) {
//        if (target.length == temp.size()) {
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = 0; i < target.length; ++i) {
//            if (used[i]) continue;
//            temp.add(target[i]);
//            used[i] = true;
//            dfs(res, temp, i+1, used, target);
//            used[i] = false;
//            temp.remove(temp.size() - 1);
//        }
//    }
}
