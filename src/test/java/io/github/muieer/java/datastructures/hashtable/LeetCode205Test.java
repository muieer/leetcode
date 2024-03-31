package io.github.muieer.java.datastructures.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeetCode205Test {

    @Test
    void isIsomorphic() {
        var obj = new LeetCode205();
        assertTrue(obj.isIsomorphic("aba", "cbd"));
    }
}
