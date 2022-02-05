package com.study.alone.linkList;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 11:31
 */
public class Alone019RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode l = removeNthFromEnd(head,3);
        System.out.println(l.val);
        System.out.println(l.next.val);
        System.out.println(l.next.next.val);
        System.out.println(l.next.next.next.val);
    }

    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode temp=head;
        Map<Integer,ListNode> map = new HashMap<>();

        int index = 1;
        while(temp!=null){
            map.put(index++,temp);
            temp = temp.next;
        }

        int size = map.size();
        if(size == 1){
            return null;
        }
        if(n == 1){
            map.get(size-1).next = null;
        }else if(n==size){
            head = head.next;
        }else{
            ListNode left = map.get(size-n);
            ListNode right = map.get(size-n+2);
            left.next=right;
        }
        return head;
    }
}
