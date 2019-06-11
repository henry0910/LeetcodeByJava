import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> key = new HashMap<>();
        int[] res = new int[2];
        int idx = 0;
        for (int i = 0; i < nums.length; ++i) {
            key.put(nums[i], key.getOrDefault(nums[i], 0) + 1);
            if (key.get(nums[i]) > 1) res[idx++] = nums[i];
        }
        for (int i = 1; i < nums.length + 1; ++i) {
            if (!key.containsKey(i)) res[idx] = i;
        }
        return res;
    }
}
