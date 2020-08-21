/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

package 顺丰;

import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test3.java v1.0 2020/8/20 9:17 下午 chenpeng Exp $
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i=0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }
        System.out.println(a[n-1][1]);
        int[] dp = new int[a[n-1][1]+1];
        int max = 0;
        for (int i=0;i<n;i++){
            for (int j = a[i][0];j<=a[i][1];j++){
                if (dp[j] != 0){
                    break;
                }
                dp[j] = a[i][2] + max;
            }
            max = dp[a[i][1]] > max ? dp[a[i][1]] : max;
        }

        int max1 = Integer.MIN_VALUE;
        for (int i=0;i<dp.length;i++){
            if (dp[i] > max1){
                max1 = dp[i];
            }
        }
        System.out.println(max1);
    }
}
