package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/2/27 14:43
 * 归并排序
 * 分为各个子序列 然后排序 然后在合并成一个最终的排序序列。
 */
public class Alone001MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{2,1,8,5,3,6,4,9};
        System.out.println(mergeSort(array).length);
    }

    public static int[] mergeSort(int[] array){
        if(array.length<2){
            return array;
        }
        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);

        return merge(mergeSort(left),mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        for(int index=0,i=0,j=0;index<result.length;index++){
            if(i>=left.length){
                result[index] = right[j++];
            }else if(j>=right.length){
                result[index] = left[i++];
            }else if(left[i]>right[j]){
                result[index] = right[j++];
            }else {
                result[index] = left[i++];
            }
        }

        return result;
    }
}
