package io.github.muieer.java.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode215Test {

    @Test
    void findKthLargest() {

        var obj = new LeetCode215();
        int[] arr = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        assertEquals(4, obj.findKthLargest(arr, 4));
    }
}
