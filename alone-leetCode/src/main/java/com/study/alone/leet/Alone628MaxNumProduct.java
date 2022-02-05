package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 21:09
 */
public class Alone628MaxNumProduct {
    public static void main(String[] args) {
        int[] nums = new int[]{-100,-98,-1,2,3,4};
        System.out.println(maxNumProduct(nums));
    }

    public static int maxNumProduct(int[] nums){
        Arrays.sort(nums);
        int max = Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                nums[nums.length-1]*nums[0]*nums[1]);
        return max;
    }
}
