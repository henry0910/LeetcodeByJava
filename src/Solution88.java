import java.util.Arrays;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] == 0) {
                nums1[idx1++] = nums2[idx2++];
            }
            else
                idx1++;
        }
        Arrays.sort(nums1);
    }
}
