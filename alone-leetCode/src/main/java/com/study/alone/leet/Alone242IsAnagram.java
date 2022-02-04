package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 12:50
 */
public class Alone242IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i=0;i<s.length();i++){
            if(sc[i]!=tc[i]){
                return false;
            }
        }
        return true;
    }
}
