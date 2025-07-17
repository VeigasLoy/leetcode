// Last updated: 7/17/2025, 10:17:15 AM
class Solution {
    int[] dp = new int[31];

    public int fib(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
