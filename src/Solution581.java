import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] comp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(comp);
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != comp[i]) {
                start = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] != comp[i]) {
                end = i;
                break;
            }
        }
        return (start == -1 || end == -1) ? 0 : end - start + 1;
    }
}
