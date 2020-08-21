/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test5.java v1.0 2020/8/9 5:17 下午 chenpeng Exp $
 */
public class test5 {

    public static void main(String[] args) {
        int[][] trips = {{2,1,4},{4,2,6}};
        int capacity = 5;
        minCarCount(trips,capacity);
    }


    public static int minCarCount (int[][] trips, int capacity) {
        // write code here
        int[] allTrip = new int[1001];
        int count = 0;
        for(int i=0;i<trips.length;i++){
            for(int j=trips[i][1];j<trips[i][2];j++){
                allTrip[j] += trips[i][0];
                if(allTrip[j] > capacity)
                    count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
