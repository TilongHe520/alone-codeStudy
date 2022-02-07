package com.study.alone.linkList;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/7 12:56
 */
public class Alone2095DeleteMiddle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(5,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(6,listNode2);
        ListNode listNode4 = new ListNode(2,listNode3);

        ListNode l = deleteMiddle(listNode4);
    }

    public static ListNode deleteMiddle(ListNode head) {
        if(head ==null){
            return head;
        }
        if(head.next == null){
            return null;
        }

        ListNode temp = head;
        Map<Integer,ListNode> map = new HashMap<>();

        int i=0;
        while(temp!=null){
            map.put(i++,temp);
            temp = temp.next;
        }

        ListNode left = map.get(map.size()/2-1);
        ListNode right = map.get(map.size()/2+1);
        left.next=right;

        return head;

    }
}
