class Solution {
    public int longestOnes(int[] nums, int k) {
          int n = nums.length;
           int max = Integer.MIN_VALUE;
        int j=0;
        int zero=0;

        for (int i = 0; i < n; i++) {
           if( nums[i]==0) zero++;
            while (zero>k) {
              if(nums[j] == 0) zero--;
              j++;
            }
            max= Math.max(max, i - j+1);

        }

        return max == Integer.MIN_VALUE ? 0 : max;
        
    }
}