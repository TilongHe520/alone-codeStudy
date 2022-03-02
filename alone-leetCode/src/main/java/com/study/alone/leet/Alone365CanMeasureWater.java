package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/20 16:41
 */
public class Alone365CanMeasureWater {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(3,5,4));
    }
    public static int gcd(int x,int y){
        return y==0?x:gcd(y,x%y);
    }

    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity<targetCapacity){
            return false;
        }
        if(jug2Capacity==targetCapacity||jug1Capacity==targetCapacity||jug1Capacity+jug2Capacity==targetCapacity){
            return true;
        }

        return targetCapacity%gcd(jug1Capacity,jug2Capacity)==0;
    }
}
