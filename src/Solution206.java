public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode to_do = head.next;
        ListNode reversed = head;
        reversed.next = null;
        while (to_do != null) {
            ListNode temp = to_do;
            to_do = to_do.next;
            temp.next = reversed;
            reversed = temp;
        }
        return reversed;
    }
}
