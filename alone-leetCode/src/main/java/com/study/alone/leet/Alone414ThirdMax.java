package com.study.alone.leet;

import java.util.*;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 14:56
 */
public class Alone414ThirdMax {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,2};

        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sets = new LinkedHashSet<>();
        for (int i:nums){
            sets.add(i);
        }
        List list = new ArrayList(sets);
        if (list.size()<3){

            return (int) list.get(list.size()-1);
        }
        return (int) list.get(list.size()-3);
    }
}
