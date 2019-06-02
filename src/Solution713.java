
//slide window
public class Solution713 {
    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;
        for (int start = 0, end = 0; end < nums.length; ++end) {
            product *= nums[end];
            while (product >= k && start <= end) product /= nums[start++];
            count += end - start + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

}
