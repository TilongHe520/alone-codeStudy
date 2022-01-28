package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 15:55
 * 存在重复元素
 */
public class Alone217containsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length<2){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
