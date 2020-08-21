/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :BK3.java v1.0 2020/8/11 7:48 下午 chenpeng Exp $
 */
public class BK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        //或运算：|
        //使区间内的数或运算最大
        //[区间的最小数 * 区间所有数的和]最大
        //区间i-j内或运算的最大值，转移公式：dp[i][j] = max(dp[i][j-1] | a[j],dp[i][j-1])
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i] = a[i] | a[i];
        }
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                dp[i][j] = Integer.max(dp[i][j-1] | a[j],dp[i][j-1]);
            }
        }
        int res = Integer.MIN_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j] > res){
                    res = dp[i][j];
                    minIndex = (j-i+1)<minIndex ? (j- i + 1) : minIndex;
                }
            }
        }
        System.out.println(minIndex);

    }



}
