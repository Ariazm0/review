package day0801;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-08-05
 * Time: 17:14
 */
public class Demo3 {
    public static ListNode deleteVal(ListNode head,int val) {
        ListNode newNode = new ListNode(-1);
        newNode.next = head;
        ListNode cur = newNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return newNode.next;
    }
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        ListNode root = demo1.build();
        ListNode node = deleteVal(root,3);
        System.out.println(node);
    }
}
