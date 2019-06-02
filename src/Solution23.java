import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < lists.length; ++i) {
            ListNode head = lists[i];
            while (head != null) {
                temp.add(head.val);
                head = head.next;
            }
        }
        if (temp.size() == 0) return null;
        Collections.sort(temp);
        int idx = 0;
        ListNode head = new ListNode(0);
        ListNode prev = new ListNode(temp.get(idx));
        head.next = prev;
        while (idx + 1 < temp.size()) {
            ListNode curr = new ListNode(temp.get(idx + 1));
            curr.next = null;
            prev.next = curr;
            prev = prev.next;
            idx++;
        }
        return head.next;
    }
}
