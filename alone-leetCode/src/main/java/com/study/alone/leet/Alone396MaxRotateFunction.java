package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/23 20:18
 */
public class Alone396MaxRotateFunction {

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,6};
        System.out.println(maxRotateFunction(nums));
    }
    public static int maxRotateFunction(int[] nums) {
        if(nums.length<=1){
            return 0;
        }

        int sum = nums[0]*(nums.length-1);
        for(int i = 0;i<nums.length-1;i++){
            sum += nums[i+1]*i;
        }

        return sum;
    }
}
