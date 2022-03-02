package com.study.alone.leet;

import java.util.Stack;

/**
 * @Author: hetilong
 * @Date: 2022/2/26 12:38
 */
public class Alone020IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("{[)}"));
    }

    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }

        }
        return stack.isEmpty();
    }
}
