import java.util.HashMap;
import java.util.Map;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new HashMap<>();
        if (headA == null || headB == null) return null;
        ListNode m = headA;
        ListNode n = headB;
        while (m != null) {
            map.put(m, 1);
            m = m.next;
        }
        while (n != null) {
            if (map.containsKey(n)) return n;
            n = n.next;
        }
        return null;
    }
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//        ListNode temp = headB;
//        while (headA != null) {
//            headB = temp;
//            while (headB != null) {
//                if (headB == headA) {
//                    return headA;
//                }
//                headB = headB.next;
//            }
//            headA = headA.next;
//        }
//        return null;
//    }
}
