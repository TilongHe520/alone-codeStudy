package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 14:10
 * 回文数
 */
public class Alone009Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }else if(x<10){
            return true;
        }else {
            String s = String.valueOf(x);
            StringBuffer sb = new StringBuffer(s);
            String s1 = sb.reverse().toString();
            return s.equals(s1);
        }
    }
}
