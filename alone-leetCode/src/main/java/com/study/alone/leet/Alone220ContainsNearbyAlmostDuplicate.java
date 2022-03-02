package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 16:18
 */
public class Alone220ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(((j-i)<=k)&&(Math.abs(nums[i]-nums[j])<=t)){
                    return true;
                }
            }
        }
        return false;
    }
}
