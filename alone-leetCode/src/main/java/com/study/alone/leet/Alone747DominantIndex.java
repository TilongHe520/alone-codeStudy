package com.study.alone.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/16 22:53
 */
public class Alone747DominantIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{3,6,0,1};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int s=0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>=2*nums[j]){
                    s=i;
                } else {
                  i=j;
                  break;
                }
            }
        }
        return s;
    }
}
