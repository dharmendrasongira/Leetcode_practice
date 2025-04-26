class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Final answer list to store all subsets
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = nums.length;  // Total number of elements in nums
        
        int k = 1 << n;        // Total number of subsets = 2^n
        
        // Loop through all numbers from 0 to (2^n - 1)
        for (int i = 0; i < k; i++) {
            // Start a new subset
            List<Integer> subset = new ArrayList<>();
            
            // Check each bit position
            for (int j = 0; j < n; j++) {
                int mask = 1 << j;   // Create a mask by shifting 1 to the left by j positions
                
                // If the j-th bit in i is set (means include nums[j] in the subset)
                if ((i & mask) != 0) {
                    subset.add(nums[j]);
                }
            }
            
            // Add the constructed subset to the final answer list
            ans.add(subset);
        }
        
        return ans; // Return all subsets
    }
}
