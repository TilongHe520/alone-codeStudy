package com.study.alone.leet;

import java.util.Arrays;

/**
 * @Author: hetilong
 * @Date: 2022/1/28 19:17
 */
public class Alone274hIndex {
    public static void main(String[] args) {

        int[] citations = new int[]{3,0,6,1,5};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {

        Arrays.sort(citations);
        int h=0;
        int i = citations.length-1;
        while (i>=0 && citations[i]>h){
            h++;
            i--;
        }
        return h;
    }
}
