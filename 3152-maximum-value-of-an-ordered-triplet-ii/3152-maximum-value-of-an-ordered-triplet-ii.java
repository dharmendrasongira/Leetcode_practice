class Solution {
    public long maximumTripletValue(int[] nums) {
        int n =nums.length;
        int maxi =0;
        long res=0;
        int diff=0;
        for(int ele :nums){
        res = Math.max(res,(long)diff*ele);  
        diff =Math.max(diff,maxi-ele);
        maxi= Math.max(maxi,ele);
        }
        return res;
    }
}