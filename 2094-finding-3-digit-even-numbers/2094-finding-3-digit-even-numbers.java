import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            if (map.containsKey(digits[i])) {
                int freq = map.get(digits[i]);
                map.put(digits[i], freq + 1);
            } else {
                map.put(digits[i], 1);
            }
        }

        List<Integer> ans = new ArrayList<>(); // Initialize ans list

        for (int i = 100; i <= 999; i += 2) { // Fix increment
            int x = i;
            int a = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int c = x;

            if (map.containsKey(a)) {
                int afreq = map.get(a);
                map.put(a, afreq - 1);
                if (afreq == 1) map.remove(a);

                if (map.containsKey(b)) {
                    int bfreq = map.get(b);
                    map.put(b, bfreq - 1);
                    if (bfreq == 1) map.remove(b);

                    if (map.containsKey(c)) {
                        ans.add(i);
                    }

                    map.put(b, bfreq); // Restore b frequency
                }
                map.put(a, afreq); // Restore a frequency
            }
        }

        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans2.length; i++) {
            ans2[i] = ans.get(i);
        }

        return ans2; // Missing return statement fixed
    }
}
