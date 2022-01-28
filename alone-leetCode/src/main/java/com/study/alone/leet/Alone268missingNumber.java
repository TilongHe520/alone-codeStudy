package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/1/28 16:52
 * 丢失的数字
 */
public class Alone268missingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2};

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length<2){
            if(nums[0]!=1){
                return 1;
            }
        }
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }

        return n;
    }

}

