package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 13:50
 * 两数之和
 */
public class Alone001TwoNumsSum {
    public static void main(String[] args) {
       int[] nums = new int[]{11,7,11,15,2};
       int target = 9;

       System.out.println(twoSum(nums,target)[1]);
    }
    public static  int[] twoSum(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int s = target -nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(s,i);
        }
        return null;
    }
}
