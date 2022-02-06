package com.study.alone.linkList;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 17:56
 */
public class Alone142DetectCycle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2,listNode);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(4,listNode2);
        ListNode listNode4 = new ListNode(5,listNode3);
        listNode4.next = listNode2;
        System.out.println(detectCycle(listNode4));
    }

    public static ListNode detectCycle(ListNode head){

        Set<ListNode> listNodeSet = new HashSet<>();
        ListNode node = head;
        while (node !=null ){
            if (listNodeSet.contains(node)){
                return node;
            }
            listNodeSet.add(node);
            node = node.next;
        }

        return null;
    }
}
