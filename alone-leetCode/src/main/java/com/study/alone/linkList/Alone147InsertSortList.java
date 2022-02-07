package com.study.alone.linkList;

import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/6 15:56
 */
public class Alone147InsertSortList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(5,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(6,listNode2);
        ListNode listNode4 = new ListNode(2,listNode3);

        //ListNode l = insertionSortList(listNode4);
        //while (l!=null){
        //    System.out.println(l.val);
        //    l=l.next;
        //}
    }


    public static ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head, curr = head.next;
        while (curr != null) {
            if (lastSorted.val <= curr.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode prev = dummyHead;
                while (prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
        }
}
