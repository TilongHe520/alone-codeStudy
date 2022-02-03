package com.study.alone.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 16:43
 */
public class Alone349Intersection {

    public static void main(String[] args) {
        int[] n1 = new int[]{1,2,2,1};
        int[] n2 = new int[]{2,2,1};
        System.out.println(intersection(n1,n2).length);

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n1: nums1){
            set1.add(n1);
        }
        for (int n2: nums2){
            set2.add(n2);
        }
        List<Integer> list = new ArrayList<>();

        for(int i :set2){
            if (set1.contains(i)){
                list.add(i);
            }
        }
        int[] inter = new int[list.size()];

        for (int i=0;i<list.size();i++) {
            inter[i] = list.get(i);
        }

        return inter;
    }
}
