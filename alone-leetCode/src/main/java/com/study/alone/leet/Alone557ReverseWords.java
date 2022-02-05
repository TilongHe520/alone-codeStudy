package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/4 17:35
 */
public class Alone557ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s){
        String[] sArr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<sArr.length;i++){
            int n = sArr[i].length();

            String str = sArr[i];
            for(int j = 0;j<n;j++){
                if(j==n-1){
                    sb.append(str.charAt(n-1-j));
                }else {
                    sb.append(str.charAt(n-1-j));
                }
            }
            if(i!=sArr.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
