class Solution {
    

        public int rec(int n, int[]dp) {
            if(n<=2) return n;
            if(dp[n]!= -1) return dp[n];
              return dp[n]= rec(n-1,dp) + rec(n-2,dp);

        }

    public int climbStairs(int n) {
        int[] dp = new int [46];
        Arrays.fill(dp,-1);
       return rec(n,  dp);
    }
}