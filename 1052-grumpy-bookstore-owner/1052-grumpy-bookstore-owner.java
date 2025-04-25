class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int sati=0;
      int n=grumpy.length;
      int max =Integer.MIN_VALUE;
      int j=minutes-1;
      for(int i=0;i<n;i++){
        if(grumpy[i]==0)sati += customers[i];
      }
      int i=0;
      while(j<n){
        int fsati=sati;
        for(int p=i;p<=j;p++){
            if(grumpy[p]==1)  fsati += customers[p];
        }
        j++;
        i++;
        max= Math.max(max,fsati);

      }
      return max;
  
        
    }
}