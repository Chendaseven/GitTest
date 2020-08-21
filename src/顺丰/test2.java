/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

package 顺丰;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test2.java v1.0 2020/8/20 9:05 下午 chenpeng Exp $
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] kuandai = new int[a];
        int[][] needs = new int[b][2];
        for (int i = 0; i < a; i++) {
            kuandai[i] = scanner.nextInt();
        }
        for (int i = 0; i < b; i++) {
            needs[i][0] = scanner.nextInt();
            needs[i][1] = scanner.nextInt();
        }
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < needs.length; i++) {
            if (temp.get(needs[i][0]) == null) {
                temp.put(needs[i][0], needs[i][1]);
            } else {
                int max = Math.max(temp.get(needs[i][0]), needs[i][1]);
                temp.put(needs[i][0], max);
            }
        }
        int ret = 0;
        for (int i = 0; i < kuandai.length; i++) {
            if (temp.containsKey(kuandai[i])) {
                ret += temp.get(kuandai[i]);
            }
        }
        System.out.println(ret);
    }
}
