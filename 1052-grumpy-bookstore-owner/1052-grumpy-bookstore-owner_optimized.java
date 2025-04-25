class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int alwaysSatisfied = 0;

        // Step 1: Add always satisfied customers (grumpy[i] == 0)
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                alwaysSatisfied += customers[i];
            }
        }

        // Step 2: Sliding window to find max extra satisfied customers
        int extraSatisfied = 0;
        int maxExtra = 0;

        for (int i = 0; i < n; i++) {
            // If grumpy, we can potentially flip them in this window
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }

            // If window size exceeded, remove from the left
            if (i >= minutes) {
                if (grumpy[i - minutes] == 1) {
                    extraSatisfied -= customers[i - minutes];
                }
            }

            maxExtra = Math.max(maxExtra, extraSatisfied);
        }

        return alwaysSatisfied + maxExtra;
    }
}
