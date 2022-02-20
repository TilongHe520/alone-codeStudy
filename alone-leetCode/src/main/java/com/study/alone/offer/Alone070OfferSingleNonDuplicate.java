package com.study.alone.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 15:43
 */
public class Alone070OfferSingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
            if(i%2!=0){
                if(list.size()!=list1.size()){
                    break;
                }
            }
        }
        return list1.get(list.size());
    }
}
