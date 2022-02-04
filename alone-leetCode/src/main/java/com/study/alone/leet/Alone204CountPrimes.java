package com.study.alone.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 10:48
 */
public class Alone204CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n){
        int count=0;
        boolean[] flag=new boolean[n];
        for(int i=2;i<n;i++){
            if(!flag[i]){
                count++;
                for(int j=i+i;j<n;j+=i){
                    flag[j]=true;
                }
            }
        }
        return count;
    }

    public int countPrimes01(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
