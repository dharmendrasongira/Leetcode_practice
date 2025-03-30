import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(); // Fixed: Store list of indexes
        int n = points.length;
        int[][] ans = new int[k][2]; // Fixed: Properly declare ans array

        // Calculate distance and store in TreeMap
        for (int i = 0; i < n; i++) {
            int x = points[i][0] * points[i][0];
            int y = points[i][1] * points[i][1];
            int dis = x + y; // Fixed: Corrected distance formula (x² + y²)

            // If distance already exists, add to the list
            map.putIfAbsent(dis, new ArrayList<>());
            map.get(dis).add(i);
        }

        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) { // Fixed: Correct way to get first 'k' elements
            for (int index : entry.getValue()) {
                if (i >= k) break; // Stop when we have 'k' points
                ans[i][0] = points[index][0];
                ans[i][1] = points[index][1];
                i++;
            }
            if (i >= k) break;
        }

        return ans;
    }
}
