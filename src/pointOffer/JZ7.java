package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ7.java v1.0 2020/7/9 7:39 下午 chenpeng Exp $
 */
public class JZ7 {

    /*
    * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
            n<=39
    *
    * */
    public int Fibonacci(int n) {
        //0 1 1 2 3 5 8 13
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);

    }

}
