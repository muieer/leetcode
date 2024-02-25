package io.github.muieer.java.algorithms.recursion;

import java.util.*;

public class LeetCode040 {


    /*
    * https://leetcode.cn/problems/combination-sum-ii/description/  40. 组合总和 II
    * */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, res, new ArrayList<>(),  0);
        return res;
    }

    /*
    * 空间复杂度 O(n)
    * */
    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> elements, int index) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(elements);
            return;
        }

        Set<Integer> usedElements = new HashSet<>();
        for (int i = index; i < candidates.length; i++) {
            // 大剪枝，前提是元素升序排序
            if (target - candidates[i] <0) {
                return;
            }
            // 小剪枝，不使用同层重复元素，这样不会有重复结果
            if (usedElements.contains(candidates[i])) {
                continue;
            }
            List<Integer> list = new ArrayList<>(elements);
            list.add(candidates[i]);
            usedElements.add(candidates[i]);
            dfs(candidates, target - candidates[i], res, list, i + 1);
        }

    }

}
