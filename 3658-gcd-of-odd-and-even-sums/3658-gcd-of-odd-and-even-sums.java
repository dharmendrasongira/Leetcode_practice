class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd =0;
        int sumEven=0;
     for(int i=1;i<=n;i++){
       sumEven +=(2*i-1);
       sumOdd +=(2*i);
      }
       int start = Math.min(sumOdd,sumEven);
       
        while(start >0){
           if (sumEven %start == 0 && sumOdd %start ==0  ) return start;
            start--;
        }
        return 1;
    }
    
}