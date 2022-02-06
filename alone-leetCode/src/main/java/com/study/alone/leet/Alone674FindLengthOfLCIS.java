package com.study.alone.leet;

import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/6 10:58
 */
public class Alone674FindLengthOfLCIS {
    public static void main(String[] args) {

        int[] nums = new int[]{2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));

    }

    public static int findLengthOfLCIS(int[] nums){
        int len = nums.length;
        if (len<2){
            return 1;
        }
        int result=0;
        for (int i=0;i<len;i++){
            int count = 1;
            for(int j=i+1;j<len;j++){
                if (nums[j-1]<nums[j]){
                    count++;
                }else {
                    break;
                }
            }
            result = Math.max(result,count);
            if (result>len-i){
                break;
            }
        }

        return result;
    }
}
