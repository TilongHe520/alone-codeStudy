package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 18:49
 */
public class Alone172TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(625));
    }
    public static int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }
}
