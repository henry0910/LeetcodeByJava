import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int curr = nums[i];
            if (!map.containsKey(curr)) map.put(curr, 1);
            else map.put(curr, map.get(curr) + 1);
        }
        List<Integer> res = new ArrayList<>();
        while (k > 0) {
            int max = Integer.MIN_VALUE;
            int max_key = -1;
            for (Integer i : map.keySet()) {
                if (map.get(i) > max) {
                    max_key = i;
                    max = map.get(i);
                }
            }
            res.add(max_key);
            k--;
            map.remove(max_key);
        }
        return res;
    }
}
