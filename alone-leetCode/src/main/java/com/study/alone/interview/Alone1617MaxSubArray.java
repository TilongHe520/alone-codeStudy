package com.study.alone.interview;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 13:48
 */
public class Alone1617MaxSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int dp = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            dp = Math.max(nums[i], dp + nums[i]);
            max = Math.max(dp, max);
        }
        return max;
    }
}
