package io.github.muieer.java.algorithms.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        var obj = new QuickSort();
        var actualArr = new int[] {3, 1, 2, 4, 0, 9, 20, 3};
        var expectedArr = actualArr.clone(); // 深拷贝
        obj.quickSort(actualArr);
        Arrays.sort(expectedArr);
        assertArrayEquals(expectedArr, actualArr);
    }
}
