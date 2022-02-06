package com.study.alone.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/5 22:30
 */
public class Alone004FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,5};
        int[] nums1 = new int[]{3,6,7};

        System.out.println(findMedianSortedArrays(nums,nums1));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        int len = (nums1.length+nums2.length)/2;
        int i = 0,j=0;
        while (list.size()<=len){
            if(i>=nums1.length){
                list.add(nums2[j++]);
            }else if (j>=nums2.length){
                list.add(nums1[i++]);
            }else if (nums1[i]>nums2[j]){
                list.add(nums2[j++]);
            }else {
                list.add(nums1[i++]);
            }
        }
        if ((nums1.length+nums2.length)%2==0){
            return (double)(list.get(len-1)+list.get(len))/2;
        }
        return (double) list.get(len);
    }
}
