import java.util.ArrayDeque;
import java.util.Deque;

public class Solution239 {
    // deque solution O(n)
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; ++i) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                res[ri++] = nums[q.peek()];
            }
        }
        return res;

    }
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums == null || nums.length == 0) return new int[0];
//        int[] res = new int[nums.length - k + 1];
//        for (int i = 0; i < nums.length - k; ++i) {
//            res[i] = findMax(nums, i, i + k - 1);
//            System.out.println(i + " " +  res[i]);
//        }
//        return res;
//    }
//    private int findMax(int[] nums, int start, int end) {
//        int max_value = nums[start];
//        for (int i = start; i <= end; ++i) {
//            if (nums[i] > max_value) max_value = nums[i];
//        }
//        return max_value;
//    }
}
