package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 15:24
 */
public class Alone141HasCycle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(4,listNode2);
        ListNode listNode4 = new ListNode(5,listNode3);
        listNode4.next = listNode2;
        System.out.println(hasCycle(listNode4));

    }
    public static boolean hasCycle(ListNode head){

        ListNode fast  = head;
        ListNode slow = head;
        while (fast !=null && fast.next !=null){
            if (fast==slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
