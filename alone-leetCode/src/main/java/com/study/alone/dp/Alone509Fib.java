package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 20:16
 */
public class Alone509Fib {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
