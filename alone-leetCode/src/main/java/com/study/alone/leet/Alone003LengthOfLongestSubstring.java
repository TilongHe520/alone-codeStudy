package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 23:15
 */
public class Alone003LengthOfLongestSubstring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("bbbbbq"));

    }

    public static int lengthOfLongestSubstring(String s){

        if (s==null){
            return 0;
        }

        if (s.length()==1){
            return 1;
        }

        int result = 0;
        for (int i=0;i<s.length();i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i+1;j<s.length();j++){
                if (set.contains(s.charAt(j))){
                    result = Math.max(result,set.size());
                    break;
                }else {
                    set.add(s.charAt(j));
                }
            }
            result = Math.max(result,set.size());
            if (result>=s.length()-i){
                break;
            }
        }

        return result;
    }
}
