package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 10:19
 */
public class Alone746MinCostClimbingStairs {
    public static void main(String[] args) {

        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));

    }

    public static int minCostClimbingStairs(int[] cost){
        int[] dp = new int[cost.length+1];
        dp[0]=0;
        dp[1]=cost[0];
        dp[2] = cost[1];
        for(int i=3;i<dp.length;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-1]);
            System.out.println(dp[i]);
        }
        return Math.min(dp[cost.length],dp[cost.length-1]);
    }
}
