class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // Result array to store the final output
        int[] pre = new int[n]; // Prefix product array
        int[] suf = new int[n]; // Suffix product array

        pre[0] = 1; // First element of prefix product is 1 (since no elements to the left)
        suf[n - 1] = 1; // Last element of suffix product is 1 (since no elements to the right)

        // Compute prefix product for each element
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i - 1] * pre[i - 1]; // pre[i] stores product of all elements before index i
        }

        // Compute suffix product for each element
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = nums[i + 1] * suf[i + 1]; // suf[i] stores product of all elements after index i
        }

        // Compute the final result by multiplying prefix and suffix products
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suf[i]; // Each index stores the product of all elements except itself
        }

        return ans;
    }
}
