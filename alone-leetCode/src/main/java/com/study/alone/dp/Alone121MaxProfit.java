package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/16 20:51
 */
public class Alone121MaxProfit {
    public static void main(String[] args) {
        int[] prices =  new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }

        int[] dp = new int[prices.length+1];
        dp[0] = 0;
        for(int i=0;i<prices.length;i++){
            int s = 0;
            for(int j=i+1;j<prices.length;j++){
                s = Math.max(prices[j]-prices[i],s);
            }

            dp[i+1] = Math.max(dp[i],s);
        }

        return dp[prices.length];
    }
}
