package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 18:09
 */
public class Alone859BuddyString {
    public static void main(String[] args) {
        System.out.println(buddyStrings("aaaaaaabcd","daaaaaaacb"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        char[] sc = s.toCharArray();
        char[] gc = goal.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(gc);

        for(int i=0;i<s.length();i++){
            if (sc[i]!=gc[i]){
                return false;
            }
        }
        return true;
    }
}
