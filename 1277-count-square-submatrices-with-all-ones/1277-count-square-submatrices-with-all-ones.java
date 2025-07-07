class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int count =0;
        int n= matrix[0].length; 
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
               if(i>0 &&j>0 && matrix[i][j] ==1 ){
                int up = matrix[i-1][j];
                int prev = matrix[i][j-1];
                int upprev = matrix[i-1][j-1];
          
                    if(up !=0 &&prev !=0 &upprev !=0){
                        matrix[i][j] =1+  Math.min(up,Math.min(prev,upprev));
                    }
                    }
                     count +=matrix[i][j];
                }
                 
            }return count;
        }

}