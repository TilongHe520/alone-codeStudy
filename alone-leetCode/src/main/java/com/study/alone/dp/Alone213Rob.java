package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 16:13
 */
public class Alone213Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){

        int len = nums.length;
        if(len==1){
            return nums[0];
        }

        int[] dp1 = new int[len+1];
        int[] dp2 = new int[len];

        dp1[0] = 0;
        dp2[1] = nums[0];

        for(int i=1,j=2;i<len;i++,j++){
            dp1[j] = Math.max(dp1[j-1],nums[i]+dp1[j-2]);
        }

        for(int i=1,j=2;i<len-1;i++,j++){
            dp2[j] = Math.max(dp2[j-1],nums[i]+dp2[j-2]);
        }

        return Math.max(dp1[len],dp2[len-1]);
    }
}
