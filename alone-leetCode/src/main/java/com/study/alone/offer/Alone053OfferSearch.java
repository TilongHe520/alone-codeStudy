package com.study.alone.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 11:50
 */
public class Alone053OfferSearch {

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(search(nums,6));
    }

    public static int search(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(target,0);
        for(int num:nums){
            if(num==target){
                map.put(target,map.get(target)+1);
            }
            if(num>target){
                break;
            }
        }

        return map.get(target);
    }
}
