// Last updated: 7/17/2025, 11:19:39 AM
class Solution {
    int[] dp = new int[46];
    public int climbStairs(int n) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}