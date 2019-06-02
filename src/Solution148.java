import java.util.List;

public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        // divide the list
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        // merge l1 and l2
        return merge(l1, l2);
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            }
            else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return l.next;
    }
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode current = head;
//        ListNode insertPointer = head;
//        current = current.next;
//        while (current != null) {
//            insertPointer = head;
//            while (insertPointer != current) {
//                    if (insertPointer.val > current.val) {
//                        int temp = insertPointer.val;
//                        insertPointer.val = current.val;
//                        current.val = temp;
//                    }
//                    else {
//                        insertPointer = insertPointer.next;
//                    }
//            }
//            current = current.next;
//        }
//        return head;
//    }
}
