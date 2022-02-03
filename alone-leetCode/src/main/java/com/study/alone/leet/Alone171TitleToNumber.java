package com.study.alone.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hetilong
 * @Date: 2022/2/3 14:37
 */
public class Alone171TitleToNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("XY"));
    }

    public static int titleToNumber(String columnTitle){

        Map<Character,Integer> map = new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
        map.put('G',7);
        map.put('H',8);
        map.put('I',9);
        map.put('J',10);
        map.put('K',11);
        map.put('M',12);
        map.put('L',13);
        map.put('N',14);
        map.put('O',15);
        map.put('P',16);
        map.put('Q',17);
        map.put('R',18);
        map.put('S',19);
        map.put('T',20);
        map.put('U',21);
        map.put('V',22);
        map.put('W',23);
        map.put('X',24);
        map.put('Y',25);
        map.put('Z',26);
        char[] ct = columnTitle.toCharArray();
        int StrLen = columnTitle.length();
        int sum = 0;
        int j = 0;
        for(int i = StrLen-1;i>=0;i--){
            sum += map.get(ct[i])*Math.pow(26,j);
            j++;
        }
        return sum;
    }
}
