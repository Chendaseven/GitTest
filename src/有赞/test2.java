/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

package 有赞;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test2.java v1.0 2020/8/20 7:31 下午 chenpeng Exp $
 */
public class test2 {
    /*
    * 一个整数数组，能被5整除的元素最大和，1262
    * */
    public int maxSumDivThree(int[] nums) {
        List<Integer> one = new ArrayList<>(); // 存放 mod5=1 的数
        List<Integer> two = new ArrayList<>(); // 存放 mod5=2 的数
        List<Integer> three = new ArrayList<>(); // 存放 mod5=3 的数
        List<Integer> four = new ArrayList<>(); // 存放 mod5=4 的数

        int sum = 0;
        for (int e : nums) {
            if (e % 5 == 1) one.add(e);
            if (e % 5 == 2) two.add(e);
            if (e % 5 == 3) three.add(e);
            if (e % 5 == 4) four.add(e);
            sum += e;
        }

        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(four);

        int res = sum % 5, ans = 0;

        if (res == 0) return sum;

        if (res == 1) {
            if (two.size() >= 2) ans = Math.max(ans, sum-two.get(0)-two.get(1));
            if (one.size() >= 1) ans = Math.max(ans, sum-one.get(0));
        } else if (res == 2) {
            if (two.size() > 0) ans = Math.max(ans, sum-two.get(0));
            if (one.size() >= 2) ans = Math.max(ans, sum-one.get(0)-one.get(1));
        } else if(res == 3) {
            if (three.size() > 0) ans = Math.max(ans, sum-three.get(0));

        } else if (res == 4) {
            if (four.size() > 0) ans = Math.max(ans, sum-four.get(0));
        }
        return ans;

    }


}
