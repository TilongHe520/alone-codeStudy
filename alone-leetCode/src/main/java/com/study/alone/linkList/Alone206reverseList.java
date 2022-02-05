package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 15:36
 * 翻转链表
 */
public class Alone206reverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(4,listNode2);
        ListNode listNode4 = new ListNode(5,listNode3);

        System.out.println(reverseList(listNode4));

    }

    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return p;
    }
}
