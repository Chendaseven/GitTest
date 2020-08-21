package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ13.java v1.0 2020/7/14 8:35 下午 chenpeng Exp $
 */
public class JZ13 {
    /*
    * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    * */
    public void reOrderArray(int [] array) {
        //2 3 4 5 6 7 8
        //3 2 4 5 6 7 8
        //相对位置不变，稳定性
        //插入排序的思想
        //记录奇数的个数
        int odd = 0;
        for(int i=0;i<array.length;i++){
            //如果是奇数
            if(array[i] % 2 != 0){
                int l = i;
                while(l > odd){
                    swap(array,l,l-1);
                    l--;
                }
                odd++;
            }
        }

    }

    public void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
