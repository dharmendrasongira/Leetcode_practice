class Solution {
   public int rec( int[][] grid, int m ,int n, int[][] dp){
      if (m == 0 && n == 0)  return  grid[m][n];
      if (m < 0 || n < 0) return Integer.MAX_VALUE;
       if (dp[m][n] != -1) return dp[m][n];
       
       int left = rec( grid, m-1,n ,dp );
       int up = rec(grid, m,n-1,dp);

       return dp[m][n] = grid[m][n]+ Math.min(left, up);
           

  
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
           int[][] dp = new int[m][n];

        for (int[] row : dp) {
             Arrays.fill(row, -1);
}
        return rec(grid, m-1, n-1, dp);
    }
}


