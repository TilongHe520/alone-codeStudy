package com.study.alone.linkList;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 19:13
 */
public class Alone234IsPalindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));

    }
    public static boolean isPalindrome(ListNode head){
        StringBuffer sb = new StringBuffer();
        while (head!=null){
            int value = head.val;
            sb.append(value);
            head = head.next;
        }
        String s = sb.toString();
        String b = sb.reverse().toString();
        return s.equals(b);
    }
}
