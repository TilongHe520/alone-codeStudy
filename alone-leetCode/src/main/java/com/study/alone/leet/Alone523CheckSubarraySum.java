package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 17:10
 */
public class Alone523CheckSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {


        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum%k==0&&j-i+1>=2){
                    return true;
                }
            }
        }

        return false;
    }
}
