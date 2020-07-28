/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-07-27
 * Time: 16:56
 */
public class Demo1 {
    public ListNode build() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
/*        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);*/
        ListNode head = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        /*node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;*/
        return head;


    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = newHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        ListNode ret = demo1.removeElements(demo1.build(),2);
        System.out.println(ret);
    }
}
