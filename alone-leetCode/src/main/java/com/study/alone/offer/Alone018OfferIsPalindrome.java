package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 12:44
 */
public class Alone018OfferIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return s1.equals(s2);
    }
}
