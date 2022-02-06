package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 19:23
 */
public class Alone027OfferIsPalindrome {

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
