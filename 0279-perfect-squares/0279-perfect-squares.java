class Solution {
       public boolean isPrefect(int n) {
        int sqrt = (int)Math.sqrt(n);
        return (sqrt*sqrt ==n);
        }
    public int  minSquares(int n ,int[]dp) {
        if(isPrefect(n)) return 1;
        if(dp[n] != -1) return dp[n];
        int min =Integer.MAX_VALUE;
        for(int i =1; i*i<=n/2;i++){
          int count =minSquares(i*i,dp)+minSquares(n-i*i,dp);
           min = Math.min(min,count);
        }
        return dp[n]=min;
    }
     public int numSquares(int n) {
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        return minSquares(n,dp);

     }
}