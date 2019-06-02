import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
            }
        }
        int max_length = 1;
        int curr_length = 1;
        for (int i = 1; i < temp.size(); i++) {
            if (temp.get(i) - temp.get(i-1) == 1) {
                curr_length ++;
                if (curr_length > max_length) max_length = curr_length;
            }
            else {
                curr_length = 1;
            }
        }
        return max_length;
    }
}
