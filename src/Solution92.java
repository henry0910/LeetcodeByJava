import java.util.ArrayList;
import java.util.List;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }
        ListNode prev = null;
        ListNode start = null;
        ListNode node = head;
        for (int i = 1; i < n + 1; i++) {
            if (i == m) {
                start = node;
                break;
            }
            prev = node;
            node = node.next;
        }
        ListNode reversed = reverseUntil(start, n - m);
        if (prev != null) prev.next = reversed;
        else head = reversed;
        return head;

    }
    private ListNode reverseUntil(ListNode node, int size) {
        ListNode last = null;
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        int i = 0;
        while (i <= size) {
            next = current.next;
            current.next = prev;
            if (prev == null) last = current;
            prev = current;
            current = next;
            i++;
        }
        last.next = current;
        return prev;
    }
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        ListNode pass1 = new ListNode(0);
//        ListNode pass2 = new ListNode(0);
//        pass1.next = head;
//        pass2.next = head;
//        List<Integer> temp = new ArrayList<>();
//        pass1 = pass1.next;
//        while (pass1 != null) {
//            temp.add(pass1.val);
//            pass1 = pass1.next;
//        }
//        int left = m - 1;
//        int right = n - 1;
//        while (left < right) {
//            int nums1 = temp.get(left);
//            int nums2 = temp.get(right);
//            temp.set(left, nums2);
//            temp.set(right, nums1);
//            left++;
//            right--;
//        }
//        int idx = 0;
//        while (head != null) {
//            head.val = temp.get(idx);
//            head = head.next;
//            idx++;
//        }
//        return pass2.next;
//    }
}
