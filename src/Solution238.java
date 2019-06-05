public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        for (int i : nums) {
            product *= i;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) res[i] = productForZero(nums, i);
            else res[i] = product/nums[i];
        }
        return res;
    }
    private int productForZero(int[] nums, int index) {
        int product = 1;
        for (int i = 0; i < nums.length; ++i) {
            if (i != index) product *= nums[i];
        }
        return product;
    }
}
