public class Solution494 {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) return 0;
        calculate(nums, 0, 0, S);
        return count;

    }
    private void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length && sum == S) {
            count++;
            return;
        }
        if (i == nums.length) return;
        calculate(nums, i+1, sum+nums[i], S);
        calculate(nums, i+1, sum-nums[i], S);
    }
}
