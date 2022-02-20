package com.study.alone.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 12:25
 */
public class Alone1539FindKthPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }

    public static int findKthPositive(int[] arr, int k) {
        List<Integer> list =new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<arr.length+k;i++){
            if(set.add(i)){
                list.add(i);
                if(list.size()==k){
                    break;
                }
            }
        }

        return list.get(k-1);
    }
}
