public class Solution53 {
    // Dynamic programming
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(dp[i], max);
        }
        return max;
    }
    // divide and conquer approach
//    public int maxSubArray(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        return maxSubArraySum(nums, 0, nums.length - 1);
//    }
//    private int maxSubArraySum(int[] nums, int low, int high) {
//        if (low == high) return nums[low];
//        int mid = low + (high - low) / 2;
//        return Math.max(Math.max(maxSubArraySum(nums, low, mid), maxSubArraySum(nums, mid + 1, high)),
//                maxCrossingSum(nums, low, mid, high));
//    }
//    private int maxCrossingSum(int[] nums, int low, int mid, int high) {
//        int sum = 0;
//        int left_sum = Integer.MIN_VALUE;
//        for (int i = mid; i >= low; i--) {
//            sum += nums[i];
//            if (sum > left_sum) left_sum = sum;
//        }
//        sum = 0;
//        int right_sum = Integer.MIN_VALUE;
//        for (int i = mid + 1; i <= high; i++) {
//            sum += nums[i];
//            if (sum > right_sum) right_sum = sum;
//        }
//        return left_sum + right_sum;
//    }
}
