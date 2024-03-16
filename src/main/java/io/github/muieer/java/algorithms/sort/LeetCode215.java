package io.github.muieer.java.algorithms.sort;

import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

/*
* https://leetcode.cn/problems/kth-largest-element-in-an-array/description/
* 215. 数组中的第K个最大元素
* */
public class LeetCode215 {

    public int findKthLargest(int[] nums, int k) {
        return findKthLargestByQuickSort(nums, k);
    }

    private int findKthLargestByQuickSort(int[] nums, int k) {

        int kIndex = nums.length - k;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int partitionIndex = partition(nums, left, right);
            if (partitionIndex == kIndex) {
                return nums[kIndex];
            } else if(partitionIndex < kIndex){
                left = partitionIndex + 1;
            } else {
                right = partitionIndex - 1;
            }
        }

        return nums[kIndex];
    }

    private int partition(int[] nums, int left, int right) {
        if (left >= right) return left;
        int pivotIndex = ThreadLocalRandom.current().nextInt(right - left) + left;
        swap(nums, pivotIndex, right);
        int pivot = nums[right];
        int correctPivotIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                swap(nums, correctPivotIndex, i);
                correctPivotIndex++;
            }
        }
        swap(nums, correctPivotIndex, right);
        return correctPivotIndex;
    }

    private void swap(int[] nums, int left, int right) {
        if (left == right) return;
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
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
