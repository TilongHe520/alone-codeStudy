package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 15:24
 */
public class Alone069OfferPeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {

        for(int i=2;i<arr.length;i++){
            if(arr[i-1]>arr[i]&&arr[i-1]>arr[i-2]){
                return i-1;
            }
        }

        return 0;
    }
}
