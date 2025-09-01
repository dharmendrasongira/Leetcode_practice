class Solution {
    public int check( String s){
         int arr [] = new int [26];

          int min =Integer.MAX_VALUE;
          int max =Integer.MIN_VALUE;
             
        for(char ch :s.toCharArray()){
            int idx = ch -'a';
            arr[idx]++;
        }

        for(int freq: arr){
         if (freq > 0) {
                max = Math.max(freq, max);
                min = Math.min(freq, min);
            }
        }
        return max-min;
    }
    public int beautySum(String s) {
        int ans =0;
        int n = s.length();
       for(int i= 0;i<n;i++){
        for(int j=i+1; j<=n;j++){
             String sub = s.substring(i, j);
           ans  +=  check(sub);
        }
       }
       return ans;

    }
}