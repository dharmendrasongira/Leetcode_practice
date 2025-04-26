class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int q = queries.length;   // Number of queries
        int[] ans = new int[q];    // Answer array for each query
        
       for(int i=1;i<arr.length; i++){
         arr[i] ^=arr[i-1];
       }

       for(int j=0;j<q;j++){
        int xor=0;
        int left = queries[j][0];
        int right = queries[j][1];
        if(left ==0 ){
           xor= arr[right];
        }
        else { xor = arr[left-1]^arr[right];}
        ans[j]=xor;
       }

        
        return ans;
    }
}
