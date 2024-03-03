package io.github.muieer.java.algorithms.sort;

import java.util.PriorityQueue;

/*
* https://leetcode.cn/problems/kth-largest-element-in-an-array/description/
* 215. 数组中的第K个最大元素
* */
public class LeetCode215 {

    public int findKthLargest(int[] nums, int k) {
        return findKthLargestByHeap(nums, k);
    }

    private int findKthLargestByHeap(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && queue.size() == k && nums[i] > queue.peek()) {
                queue.poll();
            }
            if (queue.size() < k) {
                queue.offer(nums[i]);
            }
        }

        return queue.peek();
    }
}
