package io.github.muieer.java.algorithms.dynamicplanning;

public class LeetCode322 {

    public static void main(String[] args) {
        var obj = new LeetCode322();
        System.out.println(obj.coinChange(new int[]{1,2,5}, 11));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        return dpSolution(coins, amount);
    }

    private int dpSolution(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if(i-coin>=0 && dp[i-coin]>= 0) {
                    min = Math.min(min, dp[i-coin] + 1);
                }
            }
            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return dp[amount];
    }

    int res = Integer.MAX_VALUE;
    int tryCount = 0;

    private void violenceSolution(int[] coins, int amount, int count) {
        if (amount < 0) {
            tryCount++;
            return;
        }
        if (amount == 0) {
            tryCount++;
            res = Math.max(res, count);
        }
        for (int coin : coins) {
            violenceSolution(coins, amount-coin, count+1);
        }
    }
}
