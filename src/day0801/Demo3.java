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


    public int kthToLast(ListNode head, int k) {
        if (head == null) {
            return 0;
        }
        if (k <= 0) {
            return 0;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        while (k > 0) {
            node1 = node1.next;
            k--;
        }
        while (node1 != null && node2 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2.val;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int countA = 0;
        int countB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null) {
            countA++;
            curA = curA.next;
        }
        while (curB != null) {
            countB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        int len = countA - countB;
        if (len < 0) {
            curB = headA;
            curA = headB;
            len = countB- countA;
        }
        while (len > 0) {
            curA = curA.next;
            len--;
        }
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        if (curA == curB && curA != null) {
            return curA;
        }
        return null;

    }
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
