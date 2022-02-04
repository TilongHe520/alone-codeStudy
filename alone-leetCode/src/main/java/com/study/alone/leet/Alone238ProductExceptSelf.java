package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 12:30
 */
public class Alone238ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(productExceptSelf(nums)[0]);
    }

    public static int[] productExceptSelf(int[] nums){

        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            result[i] = 1;
            for (int j=0;j<nums.length;j++){
                if (j==i){
                    continue;
                }
                result[i] = result[i]*nums[j];
            }
        }
        return result;
    }
}
