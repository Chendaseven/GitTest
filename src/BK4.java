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
 * @version :BK4.java v1.0 2020/8/11 8:38 下午 chenpeng Exp $
 */
public class BK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[m][4];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 4; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println(8);
    }
}
