package test_360; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test_360.two_360.java v1.0 2020/8/16 4:38 下午 chenpeng Exp $
 */
public class two_360 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Queue<String> queue = new LinkedList<>();
        //hello undo redo world.
        int a = 0;
        String temp = "";
        String undo = "";

        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                //截取字符串
                temp = s.substring(a,i);
                if (!temp.equals("undo") && !temp.equals("redo")){
                    queue.offer(temp);
                }
                if (temp.equals("undo")){
                    undo = queue.isEmpty() ? "" :queue.peek();

                }
                if (temp.equals("redo")){
                    queue.offer(undo);
                }
                a = i+1;
            }

        }

        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()){
            sb.append(queue.peek());
        }
        System.out.println(sb.toString());
    }


}
