package com.study.alone.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 11:43
 */
public class Alone003OfferFindRepeatNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }

        return 0;
    }
}
