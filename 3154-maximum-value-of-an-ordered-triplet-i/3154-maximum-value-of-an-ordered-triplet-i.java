class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxTripletValue = 0;
        
        // Brute force approach for clarity
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long currentValue = (long)(nums[i] - nums[j]) * nums[k];
                    maxTripletValue = Math.max(maxTripletValue, currentValue);
                }
            }
        }
        
        return maxTripletValue;
    }
}