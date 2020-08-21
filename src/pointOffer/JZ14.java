package pointOffer; /**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import sun.jvm.hotspot.debugger.linux.x86.LinuxX86CFrame;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :pointOffer.JZ14.java v1.0 2020/7/14 9:31 下午 chenpeng Exp $
 */
public class JZ14 {
    /*
     * 输入一个链表，输出该链表中倒数第k个结点。
     * */
    public ListNode FindKthToTail(ListNode head, int k) {
        //设置两个指针，先让一个指针走，到走到k-1节点时启动指针2
        //当指针1到达终点，此时指针1所指的位置就是倒数第k个
        // 6,{1,2,3,4,5}

        ListNode node1 = head;
        ListNode node2 = head;
        int index = 0;
        while (node1 != null){
            if(index >= k)
                node2 = node2.next;
            index++;
            node1 = node1.next;
        }

        return index<k ? null : node2;
    }

    public class ListNode {
        int      val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
