package com.study.alone.interview;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 13:27
 */
public class Alone1706NumberOf2sInRange {
    public static void main(String[] args) {
        System.out.println(numberOf2sInRange(559366752));
    }
    public static int numberOf2sInRange(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp!=0){
                if(temp % 10 ==2){
                    count ++;
                }
                temp = temp/10;
            }
        }

        return count;
    }
}
