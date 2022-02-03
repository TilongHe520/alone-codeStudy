package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:24
 */
public class Alone168ConvertToTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    private static String convertToTitle(int numbers) {
        if (numbers<0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (numbers>0){
            numbers--;
            sb.append((char) (numbers%26 + 'A'));
            numbers = numbers/26;
        }

        return sb.reverse().toString();
    }
}
