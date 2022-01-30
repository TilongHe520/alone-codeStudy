package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 10:28
 */
public class Alone231IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int n) {

        Set<Integer> sets = new HashSet<>();
        int sum = 1;
        for(int i=0;i<31;i++){
            sets.add(sum);
            sum *=2;
        }

        if(sets.contains(n)){
            return true;
        }

        return false;
    }
}
