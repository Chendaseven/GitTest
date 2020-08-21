/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */
package pointOffer;

import pointOffer.JZ4;
import pointOffer.JZ4.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :JZ26.java v1.0 2020/8/4 3:05 下午 chenpeng Exp $
 */
public class JZ26 {
    /*
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向
     * */

    public TreeNode Convert(TreeNode root) {
        //中序遍历
        if(root==null)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode pre = null;// 用于保存中序遍历序列的上一节点
        boolean isFirst = true;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if(isFirst){
                root = p;// 将中序遍历序列中的第一个节点记为root
                pre = root;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return root;
    }

}
