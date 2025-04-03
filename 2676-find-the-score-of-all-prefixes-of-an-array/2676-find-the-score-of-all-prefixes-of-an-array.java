class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int maxi = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
            ans[i] = nums[i] + maxi;
        }
        for(int i=1;i<nums.length;i++){
            ans[i] +=ans[i-1];
        }
      return ans;
    }
}