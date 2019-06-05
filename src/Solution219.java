public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length) return false;
        for (int i = 0; i < nums.length - k; ++i) {
            for (int j = i + 1; j < i + k + 1; ++j) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}
