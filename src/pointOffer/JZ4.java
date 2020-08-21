package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ4.java v1.0 2020/7/8 4:30 下午 chenpeng Exp $
 */
public class JZ4 {
    /*
    * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
    * 则重建二叉树并返回。
    * */
    public static void main(String[] args) {

    }
    //前序：第一个是根节点
    //中序：中间是根节点
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode = reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return treeNode;
    }

    public TreeNode reConstruct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if(preStart>preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        for(int i=inStart;i<inEnd;i++){
            if(pre[preStart] == in[i]){
                //左子树个数：i-inStart，以此确定preEnd的位置，
                root.left = reConstruct(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                //右子树个数：inEnd-i，
                root.right = reConstruct(pre,i-inStart+preStart+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;

    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
}
