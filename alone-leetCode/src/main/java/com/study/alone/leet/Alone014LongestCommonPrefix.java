package com.study.alone.leet;

import java.util.*;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 20:47
 */
public class Alone014LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = new String[]{"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }

        String str = strs[0];
        for(int i = 1;i<strs.length;i++){
            while(strs[i].indexOf(str) != 0){
                str=str.substring(0,str.length()-1);
            }
        }

        return str;
    }
}
