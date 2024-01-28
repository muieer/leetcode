package io.github.muieer.java.datastructures.linkedlist;

import io.github.muieer.java.ListNode;

public class ReverseList {

    /*
    * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">206 反转链表</a>
    * */
    public ListNode reverseList(ListNode head) {

        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            var nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }

        return preNode;
    }
}