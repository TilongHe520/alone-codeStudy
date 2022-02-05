package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 15:41
 */
public class Alone083DeleteDuplicates {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);

        ListNode l = deleteDuplicates(l1);
        System.out.println(l.val);
        System.out.println(l.next.val);

    }
    public static ListNode deleteDuplicates(ListNode head){

        if (head ==null || head.next ==null){
            return head;
        }

            head.next = deleteDuplicates(head.next);

        if(head.val == head.next.val){
            head = head.next;
        }
        return head;
    }
}
