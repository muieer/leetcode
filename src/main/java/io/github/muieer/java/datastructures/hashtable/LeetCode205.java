package io.github.muieer.java.datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;

/*
 * 205. 同构字符串 https://leetcode.cn/problems/isomorphic-strings/description/
 * */
public class LeetCode205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 1) return true;

        Map<Character, String> sMap = new HashMap<>();
        Map<Character, String> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            sMap.put(sChar, sMap.getOrDefault(sChar, "") + i);
            tMap.put(tChar, tMap.getOrDefault(tChar, "") + i);
            if (!sMap.get(sChar).equals(tMap.get(tChar))) return false;
        }

        return true;
    }
}
