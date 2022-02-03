package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:28
 */
public class Alone169MajorityElement {
    public static void main(String[] args) {
        int[] n = new int[]{1,1,1,1,0};
        System.out.println(majorityElement(n));
    }

    public static int majorityElement(int[] nums){
        if(nums.length<2){
            return nums[0];
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.containsKey(i)){
                int value = map.get(i)+1;
                if (value>(nums.length/2)){
                    return i;
                }
                map.put(i,value);
            }else {
                map.put(i,1);
            }
        }
        return 0;
    }
}
