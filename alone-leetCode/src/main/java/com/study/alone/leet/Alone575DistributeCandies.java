package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 20:44
 */
public class Alone575DistributeCandies {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3,3,1,1};
        System.out.println(distributeCandies(nums));
    }
    public static int distributeCandies(int[] nums){
        if (nums.length<=3){
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        if (set.size()<nums.length/2){
            return set.size();
        }
        return nums.length/2;
    }
}
