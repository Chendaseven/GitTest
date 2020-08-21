package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ23.java v1.0 2020/7/19 3:08 下午 chenpeng Exp $
 */
public class JZ23 {
    /*
    * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
    * */

    public static void main(String[] args) {
        JZ23 j = new JZ23();
        int[] arr = {4,6,7,5};
        j.VerifySquenceOfBST(arr);
        System.out.println(j.VerifySquenceOfBST(arr));
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length<1)
            return false;

        //最后一个为root
        int l = sequence.length;
        return verfi_squ(sequence,0,l-1);

    }

    public boolean verfi_squ(int[] arr,int start,int end){
        if(end <= start)
            return true;

        //end为root下标
        int index = start;
        for(int i=start;i<end;i++){
            if(arr[i]>arr[end]){
                index = i;
                break;
            }
        }
        //判断index之后的元素是否还有比root小的，
        int j = index;
        while(j<end){
            if(arr[j] < arr[end])
                return false;
            j++;
        }
        return verfi_squ(arr,start,index-1) && verfi_squ(arr,index,end-1);
    }

}
