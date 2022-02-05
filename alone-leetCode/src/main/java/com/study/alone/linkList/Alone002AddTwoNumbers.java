package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 10:47
 */
public class Alone002AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(8);

        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println(l3.val);
        System.out.println(l3.next.val);
        System.out.println(l3.next.next.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


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
        return head.next;
    }
}
