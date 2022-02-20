package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 18:59
 */
public class Alone1668MaxRepeating {

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
    public static int maxRepeating(String sequence, String word) {
        if(sequence.equals(word)){
            return 1;
        }
        int count = 0;
        int len1 = word.length();
        int len2 = sequence.length();

        for(int i=len1;i<len2;i++){
            String s = sequence.substring(i-len1,i);
            if(s.equals(word)){
                count++;
                continue;
            }
        }

        return count;
    }
}
