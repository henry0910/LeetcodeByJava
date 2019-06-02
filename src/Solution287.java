import java.util.HashMap;

public class Solution287 {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.isEmpty() || !res.containsKey(nums[i]))
                res.put(nums[i], 1);
            else
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }
}
