import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, temp, 0, nums);
        return res;
    }
    private void dfs(List<List<Integer>> res, List<Integer> temp, int start, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(res, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
