package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ5.java v1.0 2020/7/9 10:05 上午 chenpeng Exp $
 */
public class JZ5 {

    /*用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
        栈：先进后出
        队列：先进先出

    * */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //stack1作为存储的栈，stack2作为中转
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()){
            throw new EmptyStackException();
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        //再将stack2中的元素存回stack1
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
