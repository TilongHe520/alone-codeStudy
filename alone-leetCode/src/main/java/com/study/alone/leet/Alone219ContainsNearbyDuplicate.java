package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 11:33
 */
public class Alone219ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                if (Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
