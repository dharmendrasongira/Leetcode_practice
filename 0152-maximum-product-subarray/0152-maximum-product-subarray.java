class Solution {
    public int maxProduct(int[] nums) {
         int n = nums.length;
        int currMax = nums[0]; // same as Kadane's currSum
        int currMin = nums[0]; // extra track for negatives
        int result = nums[0];

        for(int i =1;i<n;i++){
          int temp = currMax;
          
          currMax= Math.max(nums[i],Math.max(currMax*nums[i],currMin*nums[i]));
          currMin= Math.min(nums[i],Math.min(temp*nums[i],currMin*nums[i]));
        
          result =Math.max(result,currMax);
        }
        return result;
    }
}