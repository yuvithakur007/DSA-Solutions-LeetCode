class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int dp[][] = new int[n+1][n+1];
        for(int index=n-1;index>=0;index--){
          for(int time = index;time>=0;time--){
                int pick = satisfaction[index]*(time+1)+dp[index+1][time+1];
                int notpick = 0+dp[index+1][time];
                dp[index][time] = Math.max(pick,notpick);
          }
        } 
        return dp[0][0];
    }
}