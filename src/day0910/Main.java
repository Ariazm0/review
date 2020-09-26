package day0910;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0 ) {
            return null;
        }
        if (head.next == null || n == 1) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode cur1 = head;
        while (cur1 != null && n > 0) {
            cur1 = cur1.next;
            n--;
        }
        while( cur1 != null) {
            prev = cur;
            cur = cur.next;
            cur1 = cur1.next;
        }
        if (prev == null) {
            return head.next;
        }
        prev.next = cur.next;
        return head;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String inputStr = null;
            inputStr = cin.next();
        String[] split = inputStr.split(";");
        String listNodeStr = split[0];
        String[] listNodes = listNodeStr.split(",");
        ListNode listNode = new ListNode(Integer.parseInt(listNodes[0]));
        ListNode tempNode = listNode;
        for (int i = 1; i < listNodes.length; i++) {
            ListNode currNode = new ListNode(Integer.parseInt(listNodes[i]));
            tempNode.next = currNode;
            tempNode = currNode;
        }
        ListNode res = removeNthFromEnd(listNode, Integer.parseInt(split[1]));
        while (true) {
            System.out.print(res.val);
            if(res.next == null) {
                break;
            }
            System.out.print(",");
            res = res.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}