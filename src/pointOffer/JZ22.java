package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ22.java v1.0 2020/7/19 12:11 下午 chenpeng Exp $
 */
public class JZ22 {
    public ArrayList<Integer> PrintFromTopToBottom(JZ4.TreeNode root) {
        //offer加入队列
        //poll取出队列
        Queue<JZ4.TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        queue.offer(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            list.add(root.val);
            if(root.left != null)
                queue.offer(root.left);
            if(root.right != null)
                queue.offer(root.right);
        }

        return list;
    }

}
