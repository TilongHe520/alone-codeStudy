package com.study.alone.offer;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 17:13
 */
public class Alone014OfferCuttingRope {

    public static void main(String[] args) {
        System.out.println(cuttingRope(11));
    }
    public static int cuttingRope(int n) {

        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        int l = n/3;
        int r = n%3;
        if(r==0){
            return (int)Math.pow(3,l);
        }if(r==1){
            return (int)Math.pow(3,l-1)*4;
        }
        if(r==2){
            return (int)Math.pow(3,l-1)*6;
        }
        return 0;
    }
}
