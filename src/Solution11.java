public class Solution11 {
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int max_area = 0;
        for (int i = 0; i < height.length - 1; ++i) {
            for (int j = i + 1; j < height.length; ++j) {
                int smaller = Math.min(height[i], height[j]);
                int curr_area = smaller * (j - i);
                if (curr_area > max_area) max_area = curr_area;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max_area = maxArea(height);
        System.out.println(max_area);
    }
}
