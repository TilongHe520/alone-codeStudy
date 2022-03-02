package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/22 19:32
 */
public class Alone2109AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer sb = new StringBuffer();
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(j<spaces.length&&i==spaces[j]){
                sb.append(' ');
                j++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
