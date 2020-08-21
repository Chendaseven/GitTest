/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :BK2.java v1.0 2020/8/11 7:12 下午 chenpeng Exp $
 */
public class BK2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 1) {
                System.out.println(getMinMul(M));
            } else if (M == 1) {
                System.out.println(getMinMul(N));
            } else {
                int minMul = Math.min(getMinMul(N), getMinMul(M));
                System.out.println(minMul);
            }
        }
    }

    public static int getMinMul(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0){
                return i;
            }
        }
        return n;
    }
}
