/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

package 顺丰;

import java.util.*;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test1.java v1.0 2020/8/20 8:40 下午 chenpeng Exp $
 */
public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int[] daikuan = new int[m];
        int[][] kehu = new int[n][2];

        for(int i = 0; i < m; i++) {
            daikuan[i]  = input.nextInt();
        }
        for(int j = 0; j < n; j++) {
            kehu[j][0] = input.nextInt();
            kehu[j][1] = input.nextInt();
        }
        Arrays.sort(daikuan);
        int result = 0;
        for(int i = 0; i <  daikuan.length; i++) {
            int tempResult = 0;
            int index = -1;
            int needDaiKuan = daikuan[i];
            for(int j = 0; j < kehu.length; j++) {
                if(kehu[j][0] > needDaiKuan) {
                    continue;
                }
                if(kehu[j][1] > tempResult) {
                    tempResult = kehu[j][1];
                    index = j;
                }
            }
            if(index != -1){
                kehu[index ][0] = Integer.MAX_VALUE;
            }

            result = result + tempResult;
        }

        System.out.println(result);

    }

    public static void sort(int[][] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j][1] > arr[minIndex][1] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[][] arr, int i, int j) {
        int tmp1 = arr[i][0];
        int temp2 = arr[i][1];

        arr[i][0] = arr[j][0];
        arr[i][1] = arr[j][1];

        arr[j][0] = tmp1;
        arr[j][1] = temp2;
    }
}
