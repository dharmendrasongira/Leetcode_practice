class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];   
        HashMap <Integer,Integer> map =new HashMap<Integer,Integer>(); 
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(target -nums[i])){
            int   k= map.get(target -nums[i]);
             ans[0]=i;
             ans[1]=k;
             return ans;
            }
               map.put(nums[i], i); 
           
        }
        return ans;
    }
}