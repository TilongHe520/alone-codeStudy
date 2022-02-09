package com.study.alone.leet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: hetilong
 * @Date: 2022/2/9 19:53
 * 用队列实现栈
 */
public class Alone225MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public Alone225MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        Queue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q2.poll();
    }

    public int top() {
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}
