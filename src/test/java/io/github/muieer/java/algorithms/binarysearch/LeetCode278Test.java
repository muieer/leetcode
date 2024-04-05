package io.github.muieer.java.algorithms.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LeetCode278Test {

    @Test
    void firstBadVersion() {
        var obj = new LeetCode278();
        obj.badVersion = 2;
        assertEquals(obj.badVersion, obj.firstBadVersion(3));
    }
}