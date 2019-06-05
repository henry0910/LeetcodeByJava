import java.util.HashMap;
import java.util.Map;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            if (!myMap.containsKey(nums[i])) myMap.put(nums[i], 1);
            else {
                if (myMap.get(nums[i]) > 2) n--;
                else myMap.put(nums[i], myMap.get(nums[i]) + 1);
            }
        }
        return n;
    }
}
