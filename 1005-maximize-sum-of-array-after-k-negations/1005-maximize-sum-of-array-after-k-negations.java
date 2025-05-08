class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
              Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        int i =0;
        while(i<n && nums[i]<0 && k>0){
            nums[i] *= -1;
            i++;
            k--;
        }
         
        if(k%2 !=0) {
          Arrays.sort(nums);
          nums[0] *= -1;
        }
        for (int s:nums){
            sum += s;
        }
        return sum;
    }
}