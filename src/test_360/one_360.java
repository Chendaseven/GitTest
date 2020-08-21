package test_360; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test_360.one_360.java v1.0 2020/8/16 4:08 下午 chenpeng Exp $
 */
public class one_360 {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.substring(0,1));

        System.out.println(CalulateMethodCount(3));
    }

    public static int CalulateMethodCount (int num_money) {
        // write code here
        if(num_money == 0) {
            return 0;
        } else if(num_money == 1) {
            return 1;
        }
        else {
            return 2 * CalulateMethodCount(num_money - 1);
        }
    }
}
