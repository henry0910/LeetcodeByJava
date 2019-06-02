public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 1;
        while (head != null) {
            count ++;
            head = head.next;
        }
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        for (int i = 1; i < count - n; ++i) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = cur.next;
        return dummy.next;
    }
}
