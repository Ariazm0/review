package day0801;

import day0801.Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-07-28
 * Time: 21:47
 */
public class Demo2 {
    public static ListNode turn(ListNode head) {
        if (head == null) {
            return  null;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        ListNode newHead = null;
        while (cur != null) {
                ListNode Next = cur.next;
                if (cur.next == null) {
                    newHead = cur;
                }
                cur.next = prev;
                prev = prev.next;
                cur = Next;
        }
        if (head.next != null) {
            head.next = null;
        }
        cur.next = prev;
        return newHead;

    }


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        ListNode node = demo1.build();
        turn(node);
    }
}
