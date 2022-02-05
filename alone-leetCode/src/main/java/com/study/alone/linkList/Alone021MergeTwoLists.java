package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 13:02
 */
public class Alone021MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(8);

        ListNode l = mergeTwoLists(l1,l2);
        System.out.println(l.val);
        System.out.println(l.next.val);
        System.out.println(l.next.next.val);
        System.out.println(l.next.next.next.val);
    }

    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null ){
            return l2;
        }else if (l2 == null){
            return l1;
        }

        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
