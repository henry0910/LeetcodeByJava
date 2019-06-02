public class Solution540 {
    public static int singleNonDuplicate(int[] nums) {
        int end = nums.length;
        int index = 0;
        while (index < end) {
            if ((index + 1) >= end) {
                return nums[index];
            }
            if (nums[index] == nums[index+1]) {
                index += 2;
            }
            else break;
        }
        return nums[index];
    }

    public static void main (String[] args) {

    }
}
