import java.util.HashMap;

class Solution {
    public int reverse(int n) {
        int rem = 0;
        while (n != 0) {
            rem = rem * 10 + n % 10;
            n /= 10;
        }
        return rem;
    }

    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int ele : nums) {
            int key = ele - reverse(ele); // Renamed 'final' to 'key'
            
            if (map.containsKey(key)) { // Fixed 'contain' to 'containsKey'
                int freq = map.get(key);
                count += freq;
                count %= 1000000000+7;
                map.put(key, freq + 1); // Update frequency
            } else {
                map.put(key, 1); // Corrected syntax error
            }
        }
        return count;
    }
}
