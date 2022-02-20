package com.study.alone.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/17 21:15
 */
public class Alone1719MissingTwo {
    public int[] missingTwo(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=len+2;i++){
            if(set.add(i)){
                list.add(i);
            }
        }
        return new int[]{list.get(0),list.get(1)};
    }
}
