package com.study.alone.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 17:06
 */
public class Alone551CheckRecord {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }
    public static boolean checkRecord(String s){
        if (s==null){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',0);
        map.put('L',0);
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                if (s.charAt(i)=='L'){
                    list.add(i);
                }
            }
        }
        if (map.get('A')>=2){
            return false;
        }
        int count = 0;
        if (map.get('L')>=3){
            for (int i=0;i<list.size()-1;i++){
                if(list.get(i+1)-list.get(i)==1){
                    count++;
                }if (list.get(i+1)-list.get(i)!=1){
                    count=0;
                }
                if (count>=2){
                    return false;
                }
            }
        }

        return true;
    }
}
