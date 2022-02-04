package com.study.alone.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 13:57
 */
public class Alone290WordPattern {
    public static void main(String[] args) {

        System.out.println(wordPattern("abba","dog fog fog dog"));

    }

    public static boolean wordPattern(String pattern, String s){
        if (pattern.length()<1||s.length()<1){
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        char[] c = pattern.toCharArray();
        String[] sArr = s.split(" ");
        if (c.length!=sArr.length){
            return false;
        }

        for (int i=0;i<c.length;i++){
            if (map.containsKey(c[i]) ){
                if (!map.get(c[i]).equals(sArr[i])){
                    return false;
                }
            }else {
                if (map.containsValue(sArr[i])){
                    return false;
                }
                    map.put(c[i],sArr[i]);
            }
        }
        return true;
    }
}
