/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test1.java v1.0 2020/8/8 3:05 下午 chenpeng Exp $
 */
public class test1 {

    private static int sum=0;

    public static void test1() {
        Scanner sc = new Scanner(System.in);
        //n个数
        long n = sc.nextLong();
        long[] nums  = new long[(int)n];
        long res = 0;
        for(long i = 0; i < nums.length; i++){
            nums[(int)i] = sc.nextInt();
        }
        for(long num:nums){
            res = res + num/2;
        }
        System.out.println(res);
    }

    public static void su(int num){
        if(num == 0)
            return;

        for(int i=1;i<num;i++){
            if(isSu(i)){
                sum++;
            }
            su(num-i);
            sum--;
        }
    }

    //判断一个数是否是素数，num>2
    public static boolean isSu(int num){
        if(num == 1)
            return false;
        if(num == 2)
            return true;

        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n个数
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[m];
        for(int i = 0; i < m; i++){
            num[i] = sc.nextInt();
        }
        int a = 0;
        int b = m-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(a <= b){
            boolean left = false;
            for(int i=0;a+i<=b;i++){
                if(num[a+i]<num[b-i]){
                    left = true;
                    break;
                }
                if(num[a+i]>num[b-i]){
                    left = false;
                    break;
                }
            }
            if(left){
                list.add(num[a]);
                a++;
            }
            else{
                list.add(num[b]);
                b--;
            }

        }
        String s=" ";
        for(int j=0;j<list.size();j++){
//            s = s + list.get(j);
            System.out.println(list.get(j));
        }
        System.out.println(s);
    }
}
