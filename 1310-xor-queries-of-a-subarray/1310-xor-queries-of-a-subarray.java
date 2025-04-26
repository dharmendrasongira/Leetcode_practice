class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int q = queries.length;   // Number of queries
        int[] ans = new int[q];    // Answer array for each query
        
        for (int i = 0; i < q; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
            int xor = 0; // Initialize xor for this query
            
            for (int j = left; j <= right; j++) {
                xor ^= arr[j]; // XOR all elements from left to right
            }
            
            ans[i] = xor; // Store result
        }
        
        return ans;
    }
}
