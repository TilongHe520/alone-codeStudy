package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 17:07
 */
public class Alone198Rob {
    public static void main(String[] args) {

        int[] n = new int[]{2,1,1,2};
        System.out.println(rob(n));

        /**
         * 2,1,1,2
         * dp[0] = 0
         * dp[1] = 2
         * dp[2] = max(dp[1],dp[0]+num[1]) = 2
         * dp[3] = max(dp[2],dp[1]+num[2]) = 3
         * dp[4] = max(dp[3],dp[2]+num[3]) = 4
         */

    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }
}
