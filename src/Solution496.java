import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> myMap = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num)
                myMap.put(st.pop(), num);
            st.push(num);
        }
        for (int i = 0; i < nums1.length; ++i) {
            nums1[i] = myMap.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
