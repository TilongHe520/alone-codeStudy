package com.study.alone.dp;

/**
 * @Author: hetilong
 * @Date: 2022/2/17 20:14
 */
public class Alone581FindUnsortedSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        for(int i=0;i<nums.length;i++){
            int s = 0;
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[j-1]>nums[j]&&nums[j]<nums[j+1]){
                    s = j-i+2;
                }else if(nums[j-1]<nums[j]&&nums[j]>nums[j+1]){
                    s = j-i+2;
                }else{
                    break;
                }
            }

            dp[i+1] = Math.max(s,dp[i]);
        }

        return dp[nums.length];
    }
}
