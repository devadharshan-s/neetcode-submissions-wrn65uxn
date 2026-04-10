class Solution {
    private int solve(int i, int[] prices, int buyFlag, int[][] dp){

        int n = prices.length, buy = 0, sell = 0;

        if(i == n) return 0;

        if(dp[i][buyFlag] != -1) return dp[i][buyFlag];

        if(buyFlag == 0) buy = Math.max(solve(i + 1, prices, 0, dp), -prices[i] + solve(i + 1, prices, 1, dp));
        else sell = Math.max(solve(i + 1, prices, 1, dp), prices[i] + solve(i + 1, prices, 0, dp));

        dp[i][buyFlag] = Math.max(sell,buy);

        return Math.max(sell,buy);
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n][2];

        for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);

        return solve(0,prices,0,dp);
    }
}