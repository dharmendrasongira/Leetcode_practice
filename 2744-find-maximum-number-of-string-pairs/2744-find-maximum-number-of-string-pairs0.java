class Solution {
    public String reverse(String s){
           String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
              
            ch = s.charAt(i);
          
            
            r = ch + r; 
        }
        return r;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet <String> set= new HashSet<>();
        int count=0;

        for (int i=0;i<words.length;i++){
           String res= reverse(words[i]);
             if(set.contains(res)){ count++;}
        else{ set.add(words[i]);}
        
    }return count;
}}