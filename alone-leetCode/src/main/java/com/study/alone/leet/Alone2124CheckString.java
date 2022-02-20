package com.study.alone.leet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 18:02
 */
public class Alone2124CheckString {
    public static void main(String[] args) {

    }
    public boolean checkString(String s) {
        Map<Integer,Character> mapA = new LinkedHashMap<>();
        Map<Integer,Character> mapB = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                mapA.put(i,s.charAt(i));
            }else{
                mapB.put(i,s.charAt(i));
            }
        }

        if(mapA.size()==0||mapB.size()==0){
            return true;
        }
        Set<Integer> keysA = mapA.keySet();
        Object[] keyA = keysA.toArray();
        int a = (int) keyA[keyA.length-1];

        Set<Integer> keysB = mapB.keySet();
        Object[] keyB = keysB.toArray();
        int b = (int) keyB[0];

        if(b<a){
            return false;
        }

        return true;

    }
}
