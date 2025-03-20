class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
         HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
         HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();
               
      for(int i =0; i<s.length();i++){
             int scount =1;
             int tcount =1;
         if (smap.containsKey(s.charAt(i))){
            scount= smap.get(s.charAt(i));
           scount++;
         }
          if (tmap.containsKey(t.charAt(i))){
              tcount= tmap.get(t.charAt(i));
           tcount++;
         }
        tmap.put(t.charAt(i),tcount);
        smap.put(s.charAt(i),scount);  
      }

      for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (!smap.get(check).equals(tmap.get(check))) {
                return false;
            }
        }
        return true;       
    }
}