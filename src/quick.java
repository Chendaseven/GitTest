/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :quick.java v1.0 2020/7/25 6:53 下午 chenpeng Exp $
 */
public class quick {


    public static void main(String[] args) {
        int[] arr = {5,4,6,8,19,1,2,10};
        quick q = new quick();
        int[] ints = q.quickSort(arr, 0, arr.length - 1);
        for(int num:ints){
            System.out.println(num);
        }
    }

    public int[] quickSort(int[] arr,int start,int end){
        if(start < end){
            //设置第一个基准
            int firstPivot = quick_sort(arr,start,end);
            //递归调用
            quickSort(arr,start,firstPivot-1);
            quickSort(arr,firstPivot+1,end);
        }
        return arr;

    }
    public int quick_sort(int[] arr, int start, int end){
        //设置基准
        int pivot = start;
        int index = pivot + 1;

        //遍历
        for(int i = index;i<=end;i++){
            //小于基准的左移
            if(arr[i] < arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        //将基准的值和index前一个值位置交换
        swap(arr,pivot,index-1);
        return index - 1;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
