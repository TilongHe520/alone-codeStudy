package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/16 21:24
 */
public class Alone209MinSubArrayLen {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        System.out.println(minSubArrayLen(11,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if(nums==null){
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[0] = nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return 1;
            }
            int s = nums[i];
            int len = nums.length;
            for(int j=i+1;j<nums.length;j++){
                s=s+nums[j];
                if(s>=target){
                    len = Math.min(len,j-i+1);
                    break;
                }

            }

            dp[i+1] = Math.min(dp[i],len);
            sum+=nums[i];
        }
        if (sum<target){
            return 0;
        }
        return dp[nums.length];
    }
}
