package com.study.alone.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 13:30
 */
public class Alone1346CheckIfExist {

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,5,3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                return true;
            }
            if(i % 2 == 0){
                set.add(i / 2);
            }
            set.add(i * 2);
        }
        return false;
    }
}
