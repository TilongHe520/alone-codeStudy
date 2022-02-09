package com.study.alone.leet;

import java.util.Stack;

/**
 * @Author: hetilong
 * @Date: 2022/2/9 19:44
 *
 * 用两栈实现队列
 */
public class Alone232MyQueue {
    public Stack<Integer> s1;
    public Stack<Integer> s2;
    public Alone232MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s2.isEmpty() && s1.isEmpty();
    }
}
