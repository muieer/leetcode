package io.github.muieer.java.algorithms.sort;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        if (left >= right) return left;
        int randomIndex = left + ThreadLocalRandom.current().nextInt(right - left);
        swap(arr, randomIndex, right);
        int pivot = arr[right];
        int correctPivotIndex = left;
        for (int i = left; i < right; i++) {
            // 将小于等于支点的值移动到支点的左侧
            if (arr[i] < pivot) {
                swap(arr, correctPivotIndex, i);
                correctPivotIndex++;
            }
        }

        // 最后一次交换，将支点交换到正确的索引处，即左侧元素的值都小于等于支点，右侧元素的值大于支点
        swap(arr, correctPivotIndex, right);
        return correctPivotIndex;
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
