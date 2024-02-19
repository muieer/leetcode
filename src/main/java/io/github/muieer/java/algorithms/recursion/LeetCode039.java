package io.github.muieer.java.algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode039 {

    /*
    * <a href="https://leetcode.cn/problems/combination-sum/description/">39. 组合总和</a>
    * */

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();

        dfs(candidates, target, res, new ArrayList<>(), 0);

        return res;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> elements, int index) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(elements));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>(elements);
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], res, list, i);
            if (target - candidates[i] <= 0) return;
        }
    }

}
