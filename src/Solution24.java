import java.util.ArrayList;
import java.util.List;

public class Solution24 {
    // recursive
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = second.next;

        first.next = swapPairs(third);
        second.next = first;
        return second;
    }
//    public ListNode swapPairs(ListNode head) {
//        ListNode p1 = head;
//        ListNode p2 = head;
//        List<Integer> temp = new ArrayList<>();
//        while (p1 != null) {
//            temp.add(p1.val);
//            p1 = p1.next;
//        }
//        for (int i = 0; i < temp.size() - 1; i+=2) {
//            int t = temp.get(i);
//            temp.set(i, temp.get(i+1));
//            temp.set(i+1, t);
//        }
//        int idx = 0;
//        while (p2 != null) {
//            p2.val = temp.get(idx);
//            p2 = p2.next;
//            idx++;
//        }
//        return head;
//    }
}
