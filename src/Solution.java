public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode p1 = new ListNode(0);
        p1.next = head;
        ListNode prev = p1.next;
        ListNode curr = prev.next;
        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
