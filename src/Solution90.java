import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        int begin = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 || nums[i] != nums[i-1]) begin = 0;
            int size = res.size();
            for (int j = begin; j < size; j++) {
                List<Integer> curr = new ArrayList<>(res.get(j));
                curr.add(nums[i]);
                res.add(curr);
            }
            begin = size;
        }
        return res;
    }
}
