class Solution {
    public int rec(int[] cost, int i,int dp[]) {
        //base case
        if (i <= 1) {
            return cost[i];
        }
        if(dp [i] != -1)return dp[i];
        //logic

        return dp[i]= cost[i] + Math.min(rec(cost, i - 1,dp), rec(cost, i - 2,dp));
    }

    public int minCostClimbingStairs(int[] cost) {

        int i = cost.length - 1;
        int []dp =new int [cost.length];
        Arrays.fill(dp ,-1);

        return Math.min(rec(cost, i,dp), rec(cost, i - 1,dp));
    }
}