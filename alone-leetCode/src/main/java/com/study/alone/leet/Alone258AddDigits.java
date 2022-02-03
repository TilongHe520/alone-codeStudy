package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:34
 */
public class Alone258AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(18));
    }

    public static int addDigits(int nums){
        if(nums<9){
            return nums;
        }else if(nums%9 == 0){
            return 9;
        }
        return nums%9;
    }
}
