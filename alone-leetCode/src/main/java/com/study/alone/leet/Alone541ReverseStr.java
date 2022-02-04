package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 19:33
 */
public class Alone541ReverseStr {
    public static void main(String[] args) {

        System.out.println(reverseStr("abcdefg",2));

    }

    public static String reverseStr(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);

        if(s.length()<=k){
            return sb.reverse().toString();
        }
        StringBuilder sb2 = new StringBuilder(sb.substring(0,k));

        return sb2.reverse().toString()+sb1.substring(k,s.length());
    }
}
