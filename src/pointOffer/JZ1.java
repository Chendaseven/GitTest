package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ1.java v1.0 2020/7/2 2:55 下午 chenpeng Exp $
 */
public class JZ1 {

    /*
     * 在一个二维数组中（每个一维数组的长度相同），
     * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
     * */
    public boolean Find(int target, int [][] array) {
        if(array == null)
            return false;

        int x = array.length;
        int y = array[0].length;

        for(int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if(target > array[i][j]){
                    continue;
                }
                else if(target < array[i][j])
                    break;
                else
                    return true;
            }
        }
        return false;
    }
}
