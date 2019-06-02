import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(res, temp, used, nums);
        return res;
    }
    private void dfs(List<List<Integer>> res, List<Integer> temp, boolean[] used, int[] nums) {
        if (nums.length == temp.size()) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            // ?????????????
            if (used[i] || ( i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            temp.add(nums[i]);
            used[i] = true;
            dfs(res, temp, used, nums);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
