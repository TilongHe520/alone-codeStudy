package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 14:43
 */
public class Alone326IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }

    public static boolean isPowerOfThree(int n){
        Set<Long> sets = new HashSet<>();
        for(int i=0;i<20;i++){
            sets.add((long) Math.pow(3,i));
        }

        if(sets.contains((long)n)){
            return true;
        }

        return false;
    }
}
