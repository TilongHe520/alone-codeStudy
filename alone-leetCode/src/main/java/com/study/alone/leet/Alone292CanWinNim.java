package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 16:28
 */
public class Alone292CanWinNim {
    public static void main(String[] args) {
        System.out.println(canWinNim(6));
    }

    public static boolean canWinNim(int n){
        return n%4!=0;
    }
}
