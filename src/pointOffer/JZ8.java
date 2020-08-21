package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ8.java v1.0 2020/7/9 7:42 下午 chenpeng Exp $
 */
public class JZ8 {
    /*
    * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
    * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
    *
    * */
    public int JumpFloor(int target) {
        if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else
            return JumpFloor(target-1)+JumpFloor(target-2);
    }

}
