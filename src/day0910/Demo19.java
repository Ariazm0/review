package day0910;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-26
 * Time: 10:32
 */
 class Demo19 {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0 ) {
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode cur1 = head;
        while (cur1 != null && n > 0) {
            cur1 = cur1.next;

        }
        while(cur != null  && cur1 != null) {
            prev = cur;
            cur = cur.next;
            cur1 = cur1.next;
        }
        prev.next = cur.next;
        return head;
    }
}
