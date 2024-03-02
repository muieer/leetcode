package io.github.muieer.java.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        var obj = new QuickSort();
        var arr = new int[] {3, 1, 2, 4};
        obj.quickSort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4}, arr);
    }
}
