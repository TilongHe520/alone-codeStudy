package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 13:03
 */
public class Alone287FindDuplicate {
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,3,4,6};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i] ==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
