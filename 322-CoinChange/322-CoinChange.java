// Last updated: 7/18/2025, 9:07:31 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
        return 0;
        int n=coins.length;
        int []dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=amount+1;
        }
        for(int i=1;i<=amount;i++){
             for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}