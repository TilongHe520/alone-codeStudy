package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:22
 */
public class Alone167TwoSum {
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
                return new int[] { map.get(nums[i])+1, i+1};
            }
            map.put(s,i);
        }
        return null;
    }
}
