package com.study.alone.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 16:02
 */
public class Alone016OfferLengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s==""){
            return 0;
        }
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        for(int i=0;i<len;i++){
            Set<Character> set = new HashSet<>();
            int count = 1;
            for(int j=i;j<len;j++){
                if(!set.add(s.charAt(j))){
                    count = j-i;
                    break;
                }
                count = j-i+1;
            }
            dp[i+1] = Math.max(dp[i],count);
            if(dp[i+1]>=len-i){
                return dp[i+1];
            }
        }

        return dp[len];
    }
}
