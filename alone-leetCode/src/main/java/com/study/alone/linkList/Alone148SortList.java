package com.study.alone.linkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/7 18:50
 */
public class Alone148SortList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(5,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(2,listNode2);
        ListNode listNode4 = new ListNode(4,listNode3);

        ListNode l = sortList(listNode4);
        while (l!=null){
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode sortList(ListNode head) {
        ListNode result=new ListNode(-1);
        ListNode temp2 = result;

        ListNode temp1 = head;

        List<Integer> list = new ArrayList<>();

        while(temp1!=null){
            list.add(temp1.val);
            temp1 = temp1.next;
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            temp2.next = new ListNode(list.get(i));
            temp2 = temp2.next;
        }

        return result.next;
    }
}
