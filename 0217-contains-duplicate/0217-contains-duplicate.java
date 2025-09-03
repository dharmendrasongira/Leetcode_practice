class Solution {
    public boolean containsDuplicate(int[] nums) {
       int n = nums.length;
       Set <Integer> set =new HashSet<>();
        for (int ele:nums){
            if(set.contains(ele))return true;
            else set.add(ele);
        }
        return false;
    }
}