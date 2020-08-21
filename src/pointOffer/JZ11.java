package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ11.java v1.0 2020/7/9 9:51 下午 chenpeng Exp $
 */
public class JZ11 {
    /*
    * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
     * */
    public int NumberOf1(int n) {
        //7: 111
        int num = 0;
        while (n != 0){
            n = n & (n - 1);
            num++;
        }
        return num;

    }

}
