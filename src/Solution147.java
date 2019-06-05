public class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        if( head == null ){
            return head;
        }

        ListNode helper = new ListNode(0); //new starter of the sorted list
        ListNode cur = head; //the node will be inserted
        ListNode pre = helper; //insert node between pre and pre.next
        ListNode next = null; //the next node will be inserted
        //not the end of input list
        while( cur != null ){
            next = cur.next;
            //find the right place to insert
            while( pre.next != null && pre.next.val < cur.val ){
                pre = pre.next;
            }
            //insert between pre and pre.next
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
        }

        return helper.next;
    }
//    public ListNode insertionSortList(ListNode head) {
//        if (head == null) return head;
//        ListNode pointer = head;
//        ListNode last = head;
//        ListNode pointer_sec = new ListNode(0);
//        pointer_sec.next = head;
//        List<Integer> temp = new ArrayList<>();
//        while (pointer != null) {
//            temp.add(pointer.val);
//            pointer = pointer.next;
//        }
//        int[] res = new int[temp.size()];
//        for (int i = 0; i < res.length; ++i) {
//            res[i] = temp.get(i);
//        }
//        Arrays.sort(res);
//        int idx = 0;
//        while (last != null) {
//            last.val = res[idx++];
//            last = last.next;
//        }
//        return pointer_sec.next;
//    }
}
