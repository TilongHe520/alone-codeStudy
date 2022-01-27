package com.study.alone.interview;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 12:49
 * 判断是否为重排字符串
 */
public class AloneLeetCodeInter0102 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abced";
        String s3 = "abdd";

        System.out.println(checkPermutation(s1,s2));
    }

    public static boolean checkPermutation(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for(int i=0;i<chars1.length;i++){
            if(chars1[i]!=chars2[i]){
                return false;
            }
        }
        return true;
    }
}
