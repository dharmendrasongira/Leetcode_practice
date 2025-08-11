class Solution {
    public int lengthOfLongestSubstring(String s) {
       int right =0;
        int left=0;
        int max=0;
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int count=0;
         while(right<n){
          char  ch = s.charAt(right);
            if(!seen.contains(ch)){
                seen.add(ch);
                max=Math.max(max,right-left+1);
               right++;
            }
            else{
                  seen.remove(s.charAt(left));
                  left++;
            }
         } return max;
        }
    }
