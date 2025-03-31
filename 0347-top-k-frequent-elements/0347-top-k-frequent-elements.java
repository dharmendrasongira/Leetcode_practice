import java.util.*;

class Solution {
     class Pairs implements Comparable<Pairs> {  
        int freq;  
        int ele;   

        public Pairs(int freq, int ele) {  
            this.freq = freq;  
            this.ele = ele;  
        }  
        
        @Override
        public int compareTo(Pairs other) { 
            if (this.freq == other.freq) return other.ele - this.ele; // Sort by smaller element if frequency is same
            return this.freq - other.freq; // Sort by lowest frequency first (min heap)
        }  
    }
    
    

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pairs> pq = new PriorityQueue<>(); 
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            pq.add(new Pairs(freq, ele));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            Pairs t = pq.poll();
            ans[i] = t.ele;
            i++;
        }

        return ans;
    }
}
