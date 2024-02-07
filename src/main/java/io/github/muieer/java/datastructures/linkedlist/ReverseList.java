package io.github.muieer.java.datastructures.linkedlist;

import io.github.muieer.java.ListNode;

public class ReverseList {

    /*
    * <a href="https://leetcode.cn/problems/reverse-linked-list-ii/description/">92. 反转链表 II</a>
    * */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // 也覆盖了只有一个节点的情况
        if (left == right) {
            return head;
        }

        // 哨兵节点
        var dummyNode = new ListNode(-1);
        dummyNode.next = head;
        var curNode = dummyNode;

        int index = 0;
        while (index < left - 1) {
            curNode = curNode.next;
            index++;
        }

        // 开始反转的前一个节点
        var preStartNode = curNode;
        // 开始反转的节点
        var startNode = curNode.next;

        curNode = startNode;
        var preNode = dummyNode;
        index+=1;

        while (index <= right) {
            var nextNode = curNode.next;
            curNode.next = preNode; //反转
            preNode = curNode;
            curNode = nextNode;
            index++;
        }

        // 开始反转的第一个节点指向反转结束位置的后面节点
        startNode.next = curNode;
        // 开始反转的前一个节点指向反转结束的节点
        preStartNode.next = preNode;

        return dummyNode.next;
    }

    /*
    * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">206. 反转链表</a>
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