package com.study.alone.leet;

import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/6 10:02
 */
public class Alone643FindMaxAverage {
    public static void main(String[] args) {
        int[] nums = new int[]{0,4,0,3,2};
        System.out.println(findMaxAverage(nums,1));
    }

    public static double findMaxAverage(int[] nums,int k){
        if (nums.length<k){
            return 0;
        }


        if (nums.length==k){
            long sum = 0;
            for (int i:nums){
                sum +=i;
            }
            return (double) sum/k;
        }

        long sum = 0;
        for (int j = 0;j<k;j++){
            sum += nums[j];
        }
        double average = (double)sum/k;
        double[] ls = new double[nums.length-k+1];
        ls[0] = average;
        for (int i=k,j=0;i<nums.length;i++,j++){
            ls[j+1] = (ls[j]*k-nums[j]+nums[i])/k;
            average = Math.max(average,ls[j+1]);
        }


        return average;
    }
}
