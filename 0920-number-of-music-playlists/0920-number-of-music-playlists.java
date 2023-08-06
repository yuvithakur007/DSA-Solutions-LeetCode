class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        int[][] dp = new int[goal + 1][n + 1];
        int mod = 1_000_000_007;

        dp[0][0] = 1;

        for (int i = 1; i <= goal; i++) {
            for (int j = 1; j <= n; j++) {
                // Last song is new
                dp[i][j] = (int) ((long) dp[i][j] + (long) dp[i - 1][j - 1] * (n - (j - 1)) % mod);
                // Last song is old
                dp[i][j] = (int) ((long) dp[i][j] + (long) dp[i - 1][j] * Math.max(0, j - k) % mod);
                dp[i][j] %= mod;
            }
        }

        return dp[goal][n];
    }
}
//DC