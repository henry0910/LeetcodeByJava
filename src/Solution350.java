import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1) map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer> temp = new ArrayList<>();
        for (Integer i : nums2) {
            if (map.containsKey(i)) {
                temp.add(i);
                int currValue = map.get(i);
                if (currValue - 1 == 0) map.remove(i);
                else map.put(i, currValue - 1);
            }
        }
        int[] res = new int[temp.size()];
        int idx = 0;
        for (Integer i : temp) res[idx++] = i;
        return res;
    }
}
