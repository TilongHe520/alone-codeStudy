package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 15:09
 */
public class Alone342IsPowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(32));
    }

    public static boolean isPowerOfFour(int n){
        Set<Integer> sets = new HashSet<>();
        for(int i=0;i<16;i++){
            sets.add((int) Math.pow(4,i));
        }

        if(sets.contains(n)){
            return true;
        }

        return false;
    }
}
