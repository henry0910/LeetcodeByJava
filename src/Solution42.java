public class Solution42 {
    public int trap(int[] height) {
        if (height.length <= 1) return 0;
        int left = 0, right = height.length - 1;
        int sum = 0;
        while (left < right) {
            int max = 0;
            // calculate the left maximum
            while (left < right && height[left] <= height[right]) {
                max = Math.max(max, height[left]);
                sum += max - height[left];
                left++;
            }
            max = 0;
            while (left < right && height[right] < height[left]) {
                max = Math.max(max, height[right]);
                sum += max - height[right];
                right--;
            }

        }
        return sum;
    }
}
