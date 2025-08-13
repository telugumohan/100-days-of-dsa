class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        helper(dp, m-1, n-1);
        return dp[m-1][n-1];
    }
    public int helper(int[][] dp, int i, int j) {
        if(i == 0 || j == 0) return dp[i][j] = 1;
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = helper(dp, i-1, j) + helper(dp, i, j-1);
    }
}