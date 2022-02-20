package com.study.alone.interview;

/**
 * @Author: hetilong
 * @Date: 2022/2/18 09:54
 */
public class Alone1709GetKthMagicNumber {
    public int getKthMagicNumber(int k) {
        int i3=0,i5=0,i7=0;
        int[] dp = new int[k];
        dp[0]=1;
        for(int i=1;i<k;i++){
            dp[i] = Math.min(Math.min(3*dp[i3],5*dp[i5]),7*dp[i7]);
            if(dp[i]%3==0){
                i3++;
            }
            if(dp[i]%5==0){
                i5++;
            }
            if(dp[i]%7==0){
                i7++;
            }
        }
        return dp[k-1];
    }
}
