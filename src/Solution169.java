import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int half_len = nums.length / 2;
        Map<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!mymap.containsKey(nums[i])) mymap.put(nums[i], 1);
            else mymap.put(nums[i], mymap.get(nums[i]) + 1);
        }
        for (Integer i : mymap.keySet()) {
            if (mymap.get(i) > half_len) return i;
        }
        return 0;
    }
}
