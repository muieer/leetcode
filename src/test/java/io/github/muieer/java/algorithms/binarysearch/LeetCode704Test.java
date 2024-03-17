package io.github.muieer.java.algorithms.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeetCode704Test {

    LeetCode704 obj;

    @BeforeEach
    void setUp() {
        obj = new LeetCode704();
    }

    @Test
    void search() {
        assertEquals(4, obj.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }
}
