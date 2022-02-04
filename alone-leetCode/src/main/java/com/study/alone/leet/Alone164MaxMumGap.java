package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 10:36
 */
public class Alone164MaxMumGap {
    public static void main(String[] args) {
        int[] nums = new int[]{1,10,2};
        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        if (nums.length<=1){
            return 0;
        }
        int max = 0;
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            max = Math.max(nums[i]-nums[i-1],max);
        }
        return max;
    }
}
