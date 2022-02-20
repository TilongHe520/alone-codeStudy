package com.study.alone.interview;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 13:58
 */
public class Alone1611DivingBoard {
    public static void main(String[] args) {

    }
    public static int[] divingBoard(int shorter, int longer, int k) {
        if(k==0){
            return new int[]{};
        }
        int[] res = new int[k+1];
        if(shorter == longer){
            return new int[]{shorter*k};
        }
        for(int i=0;i<=k;i++){
            res[i] = shorter*(k-i)+longer*i;
        }

        return res;
    }
}
