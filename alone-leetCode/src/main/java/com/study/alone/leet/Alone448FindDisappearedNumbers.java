package com.study.alone.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/17 19:59
 */
public class Alone448FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<nums.length+1;i++){
            if(set.add(i)){
                list.add(i);
            }
        }

        return list;
    }
}
