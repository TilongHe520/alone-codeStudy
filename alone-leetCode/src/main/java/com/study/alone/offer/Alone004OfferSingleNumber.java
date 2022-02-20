package com.study.alone.offer;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 16:25
 */
public class Alone004OfferSingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]==nums[i-1]&&nums[i]==nums[i-2]){
                continue;
            }
            if(nums[i]==nums[i-1]&&nums[i]!=nums[i-2]){
                return nums[i-2];
            }
            if(nums[i]!=nums[i-1]&&nums[i]==nums[i-2]){
                return nums[i+1];
            }
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i-2]){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}
