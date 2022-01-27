package com.study.alone.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 12:29
 * 判断字符是否唯一
 */
public class AloneLeetCodeInter0101 {

    public static void main(String[] args) {

        String astr = "ltcode";
        System.out.println(isUnique(astr));

    }

    public static boolean isUnique(String astr) {
        boolean flag = true;
        int n = astr.length();
        if (n<2){
            return flag;
        }

        char[] chars = astr.toCharArray();
        Set<Character> stringSet = new LinkedHashSet<>();

        for (int i=0 ;i<n;i++){
            if (stringSet.contains(chars[i])){
                return false;
            }
            stringSet.add(chars[i]);
        }

        return true;
    }
}
