class Solution {
    class Pairs implements Comparable<Pairs> {  
        int diff;  // Stores absolute difference from x  
        int ele;   // Stores array element  

        public Pairs(int diff, int ele) {  
            this.diff = diff;  
            this.ele = ele;  
        }  

        // For max heap: larger diff comes first, for equal diffs, larger element comes first
        @Override
        public int compareTo(Pairs other) {  
            if (this.diff == other.diff) return other.ele - this.ele; // Larger element first
            return other.diff - this.diff; // Larger diff first (max heap behavior)
        }  
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        
        if (n == 1) {
            return new ArrayList<>(Arrays.asList(arr[0])); 
        }
        
        PriorityQueue<Pairs> pq = new PriorityQueue<>(); // Max heap based on compareTo method
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {  
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pairs(diff, arr[i]));
            
            if (pq.size() > k) {
                pq.poll(); // Removes the element with largest diff
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll().ele);
        }

        Collections.sort(ans);
        return ans;
    }
}