package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/17 21:05
 */
public class Alone1014MaxScoreSightseeingPair {
    public static void main(String[] args) {

    }

    public int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        if(len==0){
            return 0;
        }
        if(len==1){
            return values[0];
        }
        if(len==2){
            return values[0]+values[1]-1;
        }

        int[] dp = new int[len+1];
        dp[0]=0;
        for(int i=0;i<len;i++){
            int max = 0;
            for(int j=i+1;j<len;j++){
                max = Math.max(max,values[j]+values[i]+i-j);
            }

            dp[i+1] = Math.max(max,dp[i]);
        }

        return dp[len];
    }
}
