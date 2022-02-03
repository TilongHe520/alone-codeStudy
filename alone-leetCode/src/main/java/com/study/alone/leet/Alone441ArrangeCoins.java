package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:57
 */
public class Alone441ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n){
        long ls = (long) n*2;
        long k = (long)Math.sqrt(ls);
        while ((k*(k+1))>ls){
            k--;
        }
        return (int)k;
    }
}
