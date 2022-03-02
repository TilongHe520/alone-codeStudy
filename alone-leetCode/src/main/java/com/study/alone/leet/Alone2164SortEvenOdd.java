package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/22 19:03
 */
public class Alone2164SortEvenOdd {
    public static void main(String[] args) {
        int[] nums = new int[]{5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,21};
        int[] n = sortEvenOdd(nums);
        System.out.println(n.length);
    }

    public static int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        if(len<=2){
            return nums;
        }
        int n = len/2 + 1;;
        int[] odd = new int[n];
        int[]even = new int[n];

        int k=0,j=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                odd[k++] = nums[i];
            }else{
                even[j++] = nums[i];
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);
        int l=0;
        int m = even.length;
        for(int i=0;i<len;i++){
            if(i%2==0){
                nums[i]= odd[l++];
            }else{
                nums[i]= even[--m] ;
            }
        }

        return nums;
    }
}
