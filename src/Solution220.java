import java.util.HashMap;
import java.util.Map;

public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < Math.min(i + k + 1, nums.length); ++j) {
                if (Math.abs((long) nums[i] - (long) nums[j]) <= t) return true;
            }
        }
        return false;
    }
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k , int t) {
        // TLE approach: O(n)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (Math.abs((long)nums[i] - (long) nums[j]) <= t && Math.abs(i - j) <= k && i != j) return true;
//            }
//        }
//        return false;
//    }
}
