public class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        return getScore(nums, 0, nums.length - 1) >= 0;
    }
    private int getScore(int[] nums, int l, int r) {
        if (l == r) return nums[l];
        return Math.max(nums[l] - getScore(nums, l + 1, r), nums[r] - getScore(nums, l, r - 1));
    }
}
