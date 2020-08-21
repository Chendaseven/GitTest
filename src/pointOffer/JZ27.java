/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

package pointOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :JZ27.java v1.0 2020/8/4 4:28 下午 chenpeng Exp $
 */
public class JZ27 {
    /*
    * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
    * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
    * */
    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        //回溯
        char[] chars = str.toCharArray();
        int l  = str.length();

        String s = String.valueOf(chars);

        return null;
    }

    public void permutation_new(String str, Integer len){
        if (str.length() == len){
            list.add(str);
            return;
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        String s = String.valueOf(list);
        System.out.println(s);
    }
}
