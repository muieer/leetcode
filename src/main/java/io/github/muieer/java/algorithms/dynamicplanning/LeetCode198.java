package io.github.muieer.java.algorithms.dynamicplanning;

// 打家劫舍
public class LeetCode198 {

    public static void main(String[] args) {
        var obj = new LeetCode198();
        System.out.println(obj.rob(new int[]{1,2,3,1}));
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[1] = nums[0];
        for (int i=2; i <= nums.length; i++) {
            dp[i] = Math.max(nums[i-1] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length];
    }
}
