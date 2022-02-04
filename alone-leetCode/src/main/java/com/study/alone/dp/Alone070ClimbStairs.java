package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 20:50
 */
public class Alone070ClimbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n){
        if (n<=2){
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
