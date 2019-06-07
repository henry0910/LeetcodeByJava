import java.util.ArrayList;
import java.util.List;

public class Solution86 {
    public ListNode partition(ListNode head, int x) {

        // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            // If the original list node is lesser than the given x,
            // assign it to the before list.
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the after list.
                after.next = head;
                after = after.next;
            }

            // move ahead in the original list
            head = head.next;
        }

        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        before.next = after_head.next;

        return before_head.next;
    }
//    public ListNode partition(ListNode head, int x) {
//        if (head == null) return head;
//        List<Integer> temp = new ArrayList<>();
//        ListNode p1 = head;
//        while (p1 != null) {
//            temp.add(p1.val);
//            p1 = p1.next;
//        }
//        List<Integer> lower = new ArrayList<>();
//        List<Integer> higher = new ArrayList<>();
//        for (int i = 0; i < temp.size(); ++i) {
//            if (temp.get(i) < x) lower.add(temp.get(i));
//            else if (temp.get(i) >= x) higher.add(temp.get(i));
//        }
//        ListNode p3 = new ListNode(0);
//        p3.next = head;
//        int idx1 = 0;
//        int idx2 = 0;
//        while (idx1 < lower.size()) {
//            head.val = lower.get(idx1++);
//            head = head.next;
//        }
//        while (idx2 < higher.size()) {
//            head.val = higher.get(idx2++);
//            head = head.next;
//        }
//
//        return p3.next;
//    }
}
