package com.study.alone.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/6 11:30
 */
public class Alone728SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22).size());
    }
    public static List<Integer> selfDividingNumbers(int left,int right){

        List<Integer> list = new ArrayList<>();

        for (int i= left;i<=right;i++){
            if (check(i)){
                list.add(i);
            }else {
                continue;
            }
        }

        return list;
    }

    public static boolean check(int num) {
        int num_backup = num;
        while ( num != 0 ) {
            int digit = num % 10;
            num /= 10;
            if ( digit == 0 || num_backup % digit != 0 ) {
                return false;
            }
        }
        return true;
    }
}
