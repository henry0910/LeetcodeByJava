public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p, dummy = new ListNode(0);
        p = dummy;
        dummy.next = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
                p.next = head;
            } else {
                head = head.next;
                p = p.next;
            }
        }
        return dummy.next;
    }
}
