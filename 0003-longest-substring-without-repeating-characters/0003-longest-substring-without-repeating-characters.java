class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int max=0;
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            while(set.contains(ch)&& left <i){
                char ph = s.charAt(left);
                set.remove(ph);
                left++;
            }
            set.add(ch);
            max= Math.max(max,set.size());
        }
        return max;
    }
}