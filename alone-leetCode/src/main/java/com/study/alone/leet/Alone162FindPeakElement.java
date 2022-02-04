package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 18:24
 */
public class Alone162FindPeakElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        if (nums.length==2){
            if (nums[0]>nums[1]){
                return 0;
            }else {
                return 1;
            }

        }
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]<nums[i+1]&&nums[i+1]>nums[i+2]){
                return i+1;
            }
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        return nums.length-1;
    }
}
