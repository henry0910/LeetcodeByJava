public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode node = removeElements(head.next, val);
        if (head.val == val) return node;
        head.next = node;
        return head;
    }
}
