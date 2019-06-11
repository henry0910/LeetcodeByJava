import java.util.*;

public class Solution373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Integer[]> q = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] + o1[1] - o2[0] - o2[1];
            }
        });
        for (int i = 0; i < nums1.length; ++i) {
            for (int j = 0; j < nums2.length; ++j) {
                q.offer(new Integer[]{nums1[i], nums2[j]});
            }
        }
        for (int i = k; i > 0 && !q.isEmpty(); --i) {
            res.add(Arrays.asList(q.poll()));
        }
        return res;
    }
}
