package io.github.muieer.java.algorithms.binarysearch;

/*
 * https://leetcode.cn/problems/first-bad-version/description/ 278. 第一个错误的版本
 * */
public class LeetCode278 {

    public int badVersion;

    public int firstBadVersion(int n) {
        if (n == 1) return 1;

        int low = 1;
        int high = n;

        /*
         * 第一遍循环条件是 {@code while (low < high)}，这样做的错误是会跳过一个元素的判断
         * */
        while (low <= high) {
            int mid = ((high - low) >> 1) + low;
            if (!isBadVersion(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    boolean isBadVersion(int version) {
        return this.badVersion <= version;
    }
}
