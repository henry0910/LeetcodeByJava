import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution143 {
//     naive approach
    public void reorderList(ListNode head) {
        List<Integer> listValue = new ArrayList<>();
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            listValue.add(temp.val);
            temp = temp.next;
        }
        int idx = 0;
        int pointer = 0;
        while (head != null) {
            if (pointer % 2 == 0) {
                head.val = listValue.get(idx);
                idx ++;
            }
            else {
                head.val = listValue.get(len - 1);
                len --;
            }
            pointer ++;
            head = head.next;
        }
//
    }
}
