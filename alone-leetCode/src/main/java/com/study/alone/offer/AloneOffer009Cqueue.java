package com.study.alone.offer;

import java.util.Stack;

/**
 * @Author: hetilong
 * @Date: 2022/2/9 18:55
 * 用两个栈实现队列
 */
public class AloneOffer009Cqueue {

    public Stack<Integer> s1;
    public Stack<Integer> s2;

    public AloneOffer009Cqueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int val){
        s1.push(val);
    }

    public int deleteTail(){
        if(!s2.isEmpty()){
            return s2.pop();
        }else {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return !s2.isEmpty()?-1:s2.pop();
        }
    }
}
