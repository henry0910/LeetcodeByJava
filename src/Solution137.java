import java.util.HashMap;
import java.util.Map;

public class Solution137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i : nums) {
            temp.put(i, temp.getOrDefault(i, 0) + 1);
        }
        for (Integer i : temp.keySet()) {
            if (temp.get(i) == 1) return i;
        }
        return -1;
    }
}
