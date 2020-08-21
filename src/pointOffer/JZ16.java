//package pointOffer; /**
// * meituan.com Inc.
// * Copyright (c) 2010-2020 All Rights Reserved.
// */
//
//import java.util.LinkedList;
//import java.util.Queue;
//import .*;
//
///**
// * <p>
// *
// * </p>
// * @author chenpeng
// * @version :pointOffer.JZ16.java v1.0 2020/7/15 10:10 下午 chenpeng Exp $
// */
//public class JZ16 {
//
//    /*
//    * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
//    * */
//    public ListNode Merge(JZ3.ListNode list1, ListNode list2) {
//        // 1->3->5->7
//        // 2->4->6->8
//        //首先判断两个链表第一个节点谁大
//
//        ListNode newNode = new ListNode(0);
//        ListNode node = newNode;
//        while(list1 != null && list2 != null){
//            if(list2.val >= list1.val){
//                newNode.next = list1;
//                newNode = newNode.next;
//                list1 = list1.next;
//            }else {
//                newNode.next = list2;
//                newNode = newNode.next;
//                list2 = list2.next;
//            }
//        }
//
//        if(list1 != null){
//            newNode.next = list1;
//        }
//        if(list2 != null){
//            newNode.next = list2;
//        }
//
//        Queue queue = new LinkedList();
//        return node.next;
//    }
//}
