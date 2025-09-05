class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> ans = new  ArrayList<>();
         int n = nums.length;
           int lim = n/3;
          Arrays.sort(nums);
          int count =1;
         
       
         for(int i =1;i<n;i++){
            if(nums[i] == nums[i-1]) count += 1;
            else{
                if(count>lim){
                    ans.add(nums[i-1]);
                      }
                       count = 1;
            }

         }
         if (count > lim) ans.add(nums[n - 1]);
         return ans;
    }
}