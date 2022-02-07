package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/7 12:41
 */
public class Alone025AddTwoNumbers {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode l1 = reserveListNode(head1);
        ListNode l2 = reserveListNode(head2);
        ListNode head = new ListNode(-1);
        ListNode temp = head;

        int c = 0;
        int p = 0;

        while (l1!=null && l2!=null){
            p = (c+l1.val+l2.val)%10;
            c = (c+l1.val+l2.val)/10;
            temp.next = new ListNode(p);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            p = (c+l1.val)%10;
            c = (c+l1.val)/10;
            temp.next = new ListNode(p);
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2!=null){
            p = (c+l2.val)%10;
            c = (c+l2.val)/10;
            temp.next = new ListNode(p);
            temp = temp.next;
            l2 = l2.next;
        }
        if (c>=1){
            temp.next = new ListNode(1);
        }
        return reserveListNode(head.next);
    }

    public static ListNode reserveListNode(ListNode head){
        if(head==null||head.next==null){
            return head;
        }

        ListNode p = reserveListNode(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }
}
