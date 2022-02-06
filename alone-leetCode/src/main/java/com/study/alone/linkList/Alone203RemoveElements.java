package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 19:29
 */
public class Alone203RemoveElements {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val){

        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode current = result;
        while (current.next!=null){
            if (current.next.val == val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return result.next;
    }
}
