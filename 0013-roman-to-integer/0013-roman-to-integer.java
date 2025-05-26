class Solution {
    public int romanToInt(String s) {
        int n  = s.length();
         HashMap<Character, Integer> map = new HashMap<>();
         map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
         int sum =0;

        for(int  i=0 ;i<n;i++){
            char ch = s.charAt(i);
               int value = map.get(ch);
               // check if next character exists and is larger (subtractive case)
            if (i + 1 < n && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= value;
            }
            else{
                sum += value;
            }
         
        }
        return sum;

    }

}