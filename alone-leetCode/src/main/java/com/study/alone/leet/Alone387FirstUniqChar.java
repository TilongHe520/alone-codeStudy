package com.study.alone.leet;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 14:27
 */
public class Alone387FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("asqdasdq"));
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char c :chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        for(char key:map.keySet()){
            if(map.get(key)==1){
                int index = sb.indexOf(String.valueOf(key));
                return index;
            }
        }
        return -1;
    }
}
