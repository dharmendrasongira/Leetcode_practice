class Solution {
    public int checkPalindrome(int i , int j,String str) {
         int n= str.length();
        while (i >=0 && j<n && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        return j-i-1;
    }

    public String longestPalindrome(String s) {
        
        if (s.length() == 0)
            return "";
            int maxlen =0;
            int centeridx =0;
           
        for (int i = 0; i < s.length() - 1; i++) {
                int len1  =checkPalindrome(i,i ,s);
                int len2 = checkPalindrome(i,i+1,s);
                int len =Math.max(len1,len2);
                
                if(len>maxlen){
                    maxlen= len;
                    centeridx=i;
                }
            }
              int start = centeridx - (maxlen-1)/2;
         int end = centeridx +maxlen/2;

            return s.substring(start,end+1);

         }
       
}
        
 