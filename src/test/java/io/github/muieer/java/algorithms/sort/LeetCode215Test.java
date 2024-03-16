package io.github.muieer.java.algorithms.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeetCode215Test {

    LeetCode215 obj;

    @BeforeEach
    void setUp() {
        obj = new LeetCode215();
    }

    @Test
    void findKthLargest() {
        int[] arr = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        assertEquals(4, obj.findKthLargest(arr, 4));
    }
}
