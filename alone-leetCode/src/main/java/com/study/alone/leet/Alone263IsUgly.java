package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/1/30 11:06
 */
public class Alone263IsUgly {

    public static void main(String[] args) {
        System.out.println(isUgly(15));
    }

    public static boolean isUgly(int num) {

        if(num<=0){
            return false;
        }
        while (true) {
            if (num == 1 || num == 2 || num == 3 || num == 5) {
                return true;
            }
            if (num%2 == 0) {
                num /= 2;
            }else if (num%3 == 0) {
                num /= 3;
            }else if (num%5 == 0) {
                num /= 5;
            }else {
                return false;
            }
        }

    }
}
