package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 15:56
 */
public class Alone283MoveZeroes {
    public static void main(String[] args) {

    }

    public static void moveZeroes(int[] nums){
        int j = 0;
        for(int index = 0;index<nums.length;index++){
            if (nums[index]!=0){
                nums[j]=nums[index];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
