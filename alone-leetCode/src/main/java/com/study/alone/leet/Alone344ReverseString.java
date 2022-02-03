package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 16:32
 */
public class Alone344ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'a','b','c','d','e'};
        reverseString(s);
    }

    public static void reverseString(char[] s){
        int n = s.length;
        for(int i=0;i<n/2;i++){
            char t = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = t;
        }
        for (char c:s) {
            System.out.println(c);
        }
    }
}
