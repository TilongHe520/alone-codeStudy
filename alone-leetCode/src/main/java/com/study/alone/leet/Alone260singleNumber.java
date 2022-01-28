package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/1/28 16:38
 * 只出现一次的数字 III
 */
public class Alone260singleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,2,5};
        System.out.println(singleNumber(nums)[1]);
    }

    public static int[] singleNumber(int[] nums){
        if(nums.length<2){
            return nums;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int[] singleNumber =new int[2];
        int i=0;
        for(Map.Entry<Integer, Integer> m :map.entrySet()){
            if(m.getValue().equals(1)){
                singleNumber[i]=m.getKey();
                i++;
            }
        }
        return singleNumber;
    }
}
