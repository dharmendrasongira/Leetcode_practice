class Solution {
    public boolean isPerfectSquare(int n){
     int root =(int)Math.sqrt(n);
     return (n==root*root);
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        return ( ((n&n-1)==0) && (isPerfectSquare(n)));
        
    }
}