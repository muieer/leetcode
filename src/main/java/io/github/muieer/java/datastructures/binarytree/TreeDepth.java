package io.github.muieer.java.datastructures.binarytree;

import io.github.muieer.java.TreeNode;

/*
* https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/ 104. 二叉树的最大深度
* */
public class TreeDepth {

    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftLength = dfs(root.left);
        int rightLength = dfs(root.right);
        return Math.max(leftLength, rightLength) + 1;
    }
}
