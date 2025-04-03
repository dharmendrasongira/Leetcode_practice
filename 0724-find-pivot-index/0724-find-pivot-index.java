class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
         int [] arr= new int[n];
         arr[0]=nums[0]; 
       for(int i=1;i<nums.length;i++){

       arr[i] =nums[i]+arr[i-1]; 
     }
      for(int i=0 ;i<n;i++){
        int left=0; int right=0;
        if(i>0) {
         left=arr[i-1];}
         right =arr[n-1]-arr[i];
         if(right== left)return i;
      }
      return -1;

}}