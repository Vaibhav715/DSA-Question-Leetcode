class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        // dp[i][j] stores the maximum score difference (current player - opponent)
        // for the subarray piles[i...j]
        int[][] dp = new int[n][n];

        // Base case: only one pile remaining
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        // Fill table for subarrays of length 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Math.max(
                    piles[i] - dp[i + 1][j], 
                    piles[j] - dp[i][j - 1]
                );
            }
        }

        // If score difference is positive, Alice scored more than Bob
        return dp[0][n - 1] > 0;
    }
}