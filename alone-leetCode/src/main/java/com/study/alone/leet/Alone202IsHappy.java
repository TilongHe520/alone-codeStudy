package com.study.alone.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/1/29 12:38
 * // 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * // 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * // 如果这个过程 结果为 1，那么这个数就是快乐数。
 */
public class Alone202IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }

    public static boolean isHappy(int n) {
        Set<Integer> sets = new HashSet<>();
        while (n!=1 && !sets.contains(n)){
            sets.add(n);
            n = getNext(n);
            System.out.println(n);
        }
        return n==1;
    }

    public static int getNext(int n){
        int sum = 0;
        char[] chars = String.valueOf(n).toCharArray();
        for(char c:chars){
            String s = String.valueOf(c);
            sum +=Math.pow(Integer.parseInt(s),2);
        }
        return sum;
    }
}
