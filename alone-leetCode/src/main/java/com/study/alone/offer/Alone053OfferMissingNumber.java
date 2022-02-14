package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 11:56
 */
public class Alone053OfferMissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }

        return nums.length;
    }
}
