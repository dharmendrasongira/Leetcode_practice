import java.util.*;

class Solution {

    // Custom Class to Store (distance, x, y)
    class Triplet {
        int d, x, y;

        Triplet(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        // Max Heap (Descending Order of Distance)
        PriorityQueue<Triplet> pq = new PriorityQueue<>(new Comparator<Triplet>() {
            public int compare(Triplet a, Triplet b) {
                return Integer.compare(b.d, a.d); // Max Heap based on distance
            }
        });

        // Add Points to Priority Queue
        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int dis = x * x + y * y;

            pq.add(new Triplet(dis, x, y));
            if (pq.size() > k) {
                pq.poll(); // Remove the farthest element
            }
        }

        // Extract k closest points
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }

        return ans;
    }
}
