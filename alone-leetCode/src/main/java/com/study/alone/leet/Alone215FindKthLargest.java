package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 11:26
 */
public class Alone215FindKthLargest {
    public static void main(String[] args) {
        int[] nums = new int[]{10,2,3};
        System.out.println(findKthLargest(nums,2));
    }

    public static int findKthLargest(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
