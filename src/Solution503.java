import java.util.Stack;

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        // stack
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--)
            st.push(i);
        for (int i = n - 1; i >= 0; i--) {
            result[i] = -1;
            while (!st.isEmpty() && nums[st.peek()] <= nums[i])
                st.pop();
            if (!st.isEmpty())
                result[i] = nums[st.peek()];
            st.add(i);
        }
        return result;
        // naive approach
//        int max = Integer.MIN_VALUE;
//        for (int num : nums) {
//            max = Math.max(max, num);
//        }
//
//        int n = nums.length;
//        int[] result = new int[n];
//        int[] temp = new int[n * 2];
//
//        for (int i = 0; i < n * 2; i++) {
//            temp[i] = nums[i % n];
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = -1;
//            if (nums[i] == max) continue;
//
//            for (int j = i + 1; j < n * 2; j++) {
//                if (temp[j] > nums[i]) {
//                    result[i] = temp[j];
//                    break;
//                }
//            }
//        }
//
//        return result;
    }
}
