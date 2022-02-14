package com.study.alone.offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 12:02
 */
public class Alone050OfferFirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("babazccdeff"));
    }

    public static char firstUniqChar(String s) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }

        }

        for (Character key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return ' ';
    }
}
