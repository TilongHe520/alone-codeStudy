package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/19 18:23
 */
public class Alone2000ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int temp = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                temp = i;
                break;
            }
        }
        StringBuffer sb= new StringBuffer();
        sb.append(word.substring(0,temp+1));

        return sb.reverse().toString()+word.substring(temp+1,word.length());
    }
}
