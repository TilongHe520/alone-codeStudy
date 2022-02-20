package com.study.alone.leet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 17:39
 */
public class Alone2129CapitalizeTitle {

    public String capitalizeTitle(String title) {


        String[] str = title.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String s : str){
            int len = s.length();
            if(len > 2){
                for(int i = 0; i < len; i++){
                    if(i == 0) {
                        sb.append(Character.toUpperCase(s.charAt(i)));
                    } else {
                        sb.append(Character.toLowerCase(s.charAt(i)));
                    }
                }
            }else {
                for(int i = 0; i < len; i++){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
