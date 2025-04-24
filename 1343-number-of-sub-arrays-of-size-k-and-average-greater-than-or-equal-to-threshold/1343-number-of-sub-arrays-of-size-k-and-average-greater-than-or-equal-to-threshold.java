class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int n = arr.length;
         int sum=0;
         int  i=0;
         int j=k-1;
         int count = 0 ;
         for(int a =0 ; a<k; a++){
          sum += arr[a];
         }
         i++;
         j++;
         if((sum/k) >= threshold) count++;

         while(j<n){
             sum = sum + arr[j] -  arr[i-1];
               if((sum/k) >= threshold) count++;
               i++;
               j++;
         }
         return count;
        
    }
}