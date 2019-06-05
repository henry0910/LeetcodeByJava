import java.util.ArrayList;
import java.util.List;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        List<Integer> temp = new ArrayList<>();
        ListNode pass1 = head;
        ListNode pass2 = head;
        while (pass1 != null) {
            temp.add(pass1.val);
            pass1 = pass1.next;
        }
        int length = temp.size();
        if (k > length) {
            k = k % length;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = length - k; i < length; ++i) {
            res.add(temp.get(i));
        }
        for (int i = 0; i < length - k; ++i) {
            res.add(temp.get(i));
        }
        int idx = 0;
        while (pass2 != null) {
            pass2.val = res.get(idx);
            pass2 = pass2.next;
            idx++;
        }
        return head;
    }
}
