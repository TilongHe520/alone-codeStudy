package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 16:13
 */
public class Alone367IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num){
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // int product = mid * mid;   越界
            int t = num / mid;
            if (t == mid) {
                if (num%mid == 0) {
                    return true;
                }
                left = mid + 1;
            } else if (t < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
