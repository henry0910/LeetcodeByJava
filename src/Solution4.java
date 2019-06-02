import java.util.Arrays;

public class Solution4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int max_len = nums1.length + nums2.length;
        int[] res = new int[max_len];
        for (int i = 0; i < nums1.length; ++i) res[i] = nums1[i];
        for (int i = 0; i < nums2.length; ++i) res[i + nums1.length] = nums2[i];
        Arrays.sort(res);
        if (max_len % 2 == 0) {
            int mid = (max_len / 2) - 1;
            return (double) (res[mid] + res[mid + 1]) / 2;
        }
        else {
            int mid = (max_len - 1) / 2;
            return (double) res[mid];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
