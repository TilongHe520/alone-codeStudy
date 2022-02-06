package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 19:02
 */
public class Alone160GetIntersectionNode {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){

        if (headA==null||headB==null){
            return null;
        }
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1!=l2){
            l1 = l1==null ? headB:l1.next;
            l2 = l2==null ? headA:l2.next;
        }
        return l1;
    }
}
