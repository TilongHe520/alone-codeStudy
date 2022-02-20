package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 15:16
 */
public class Alone088OfferMinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2;i<=cost.length;i++){
            dp[i] =Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
