package com.study.alone.interview;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 13:30
 * URL化
 * 编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，
 * 并且知道字符串的“真实”长度。
 */
public class AloneLeetCodeInter0103 {
    public static void main(String[] args) {
        String s = "     ";
        System.out.println(replaceSpaces(s,4));
    }

    public static String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<length;i++){
            if (chars[i]==' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
