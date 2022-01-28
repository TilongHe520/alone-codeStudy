package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/1/28 10:02
 */
public class Alone005longestPalindrome {
    public static void main(String[] args) {

        String s = "abaca";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int sLen = s.length();
        if(sLen<2){
            return s;
        }

        int maxStart = 0;
        int maxEnd = 0;
        int maxLen = 1;

        boolean[][] dp = new boolean[sLen][sLen];

        for(int r=1;r<sLen;r++){
            for(int l=0;l<r;l++){
                if(s.charAt(l)==s.charAt(r)&&(r-l<=2||dp[l+1][r-1])){
                    dp[l][r]=true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;
                    }
                }
            }
        }

        return s.substring(maxStart,maxEnd+1);
    }
}
