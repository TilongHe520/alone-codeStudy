package com.study.alone.leet;

import java.util.*;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 11:53
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 */
public class Alone229MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println(majorityElement(nums).toString());
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length<2){
            list.add(nums[0]);
            return list;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }


        for (Integer k:map.keySet()) {
            if(map.get(k)>(nums.length/3) && !list.contains(k)){
                list.add(k);
            }
        }
        return list;
    }
}
