class Solution {
        int[] dp;
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            dp = new int[n];
            return Math.min(minCost(cost, n-1), minCost(cost, n-2));
        }
        private int minCost(int[] cost, int n) {
            if (n < 0) return 0;
            if (n==0 || n==1) return cost[n];
            if (dp[n] != 0) return dp[n];
            dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
            return dp[n];
        }
}