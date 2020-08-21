package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.ArrayList;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ24.java v1.0 2020/7/31 11:22 上午 chenpeng Exp $
 */
public class JZ24 {
    /*
    * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
    * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
    * */
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
    return null;

    }

    public void find_path(TreeNode root, int target, int sum, ArrayList<Integer> nList){
        if(sum == target)
            list.add(nList);



    }

    public ArrayList<Integer> back(ArrayList<Integer> list){

        return null;
    }

}
