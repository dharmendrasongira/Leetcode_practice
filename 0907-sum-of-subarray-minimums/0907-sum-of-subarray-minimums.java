class Solution {
    public int sumSubarrayMins(int[] arr) {
      int n = arr.length;
        long MOD = 1_000_000_007;

        int[] left = new int[n];   // distance to previous smaller
        int[] right = new int[n];  // distance to next smaller

        Stack<Integer> stack = new Stack<>();
    // Previous Smaller Element distance (left)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
          stack.clear();
         // Calculate Next Smaller Element distance
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }
         long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) sum;

    }
}