public class Solution343 {
    public int integerBreak(int n) {
        // dp[i] denotes the maximum product breaking i, then we have state equation:
        // dp[i] = max (dp[i], max(i-j, dp[i-j]) * max(j, dp[j])) for 1 <= j < i,
        // that is, the max of all possible ways of breaking i into (i-1, 1), (i-2, 2)... (1, i -1).

        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],  Math.max(i - j, dp[i-j]) * Math.max(j, dp[j]));
            }
        }
        return dp[n];
    }
}
