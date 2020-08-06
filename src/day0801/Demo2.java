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
    public boolean chkPalindrome(ListNode A) {
        // write code here
        ListNode slow = A;
        ListNode fast = A;
        if (A == null) {
            return true;
        }
        while (fast != null && (fast.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode Next = cur.next;
            cur.next = slow;
            slow = cur;
            cur = Next;
        }
        while (A.val == slow.val) {
            if (A.next == slow.next || A == slow.next) {
                return true;
            }
            A = A.next;
            slow = slow.next;
        }
        return false;

    }


    public ListNode deleteDuplication(ListNode pHead) {

        ListNode cur = pHead;
        ListNode node = new ListNode(-1);
        ListNode prev = node;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                prev.next = cur;
                cur = cur.next;
                prev = prev.next;
            }
        }
        prev.next = null;
        return node.next;

    }

    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return  null;
        }
        ListNode node1 = new ListNode(-1);
        ListNode head1 = node1;
        ListNode node2 = new ListNode(-1);
        ListNode head2 = node2;
        while (pHead != null) {
            if (pHead.val < x) {
                node1.next = pHead;
                node1 = node1.next;
            }else {
                node2.next = pHead;
                node2 = node2.next;
            }
            pHead = pHead.next;
        }
        node1.next = head2.next;
        node2.next = null;
        return head1.next;

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        if (l1 == null && l2 == null) {
            return null;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;

            }else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            node.next = l1;
        }
        if (l2 != null) {
            node.next = l2;
        }
        return head.next;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (k-- > 0) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null &&fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

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
        Demo2 demo2 = new Demo2();
        ListNode ret = demo2.partition(node,3);
        System.out.println(ret);
    }
}
