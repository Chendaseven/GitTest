/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import com.sun.java.swing.action.BackAction;

import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :BK1.java v1.0 2020/8/11 7:01 下午 chenpeng Exp $
 */
public class BK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //长度
        int n = sc.nextInt();
        String s = sc.next();

        StringBuffer sb = new StringBuffer();
        //将字符串逆序
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String s2 = sb.toString();
        int count = 0;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s2.charAt(i))
                count++;
        }
        System.out.println(count);

        /*
        * 5
          acacb

          4
          acac
        * */


    }

}
