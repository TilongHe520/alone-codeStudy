package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 11:45
 */
public class Alone383CanConstruct {
    public static void main(String[] args) {

        System.out.println(canConstruct("aaaaA","Aaaaa"));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int rLen = ransomNote.length();
        int mLen = magazine.length();
        if(rLen>mLen){
            return false;
        }
        char[] r = ransomNote.toCharArray();
        StringBuilder sb = new StringBuilder(magazine);
        for(char i : r){
            int index = sb.indexOf(String.valueOf(i));
            if(index>=0){
                sb.deleteCharAt(index);
            }else {
                return false;
            }
        }

        return true;
    }
}
