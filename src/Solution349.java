import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    //public int[] intersection(int[] nums1, int[] nums2) {
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < nums1.length; ++i) {
//            for (int j = 0; j < nums2.length; ++j) {
//                if (nums1[i] == nums2[j] && !temp.contains(nums1[i])) temp.add(nums1[i]);
//            }
//        }
//        int[] res = new int[temp.size()];
//        for (int i = 0; i < temp.size(); ++i) {
//            res[i] = temp.get(i);
//        }
//        return res;
//    }
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Arrays.sort(nums2);
            for (Integer num : nums1) {
                if (binarySearch(nums2, num)) set.add(num);
            }
            int i = 0;
            int[] res = new int[set.size()];
            for (Integer num : set) {
                res[i++] = num;
            }
            return res;
        }
        private boolean binarySearch(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) return true;
                if (nums[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            return false;
        }
}
