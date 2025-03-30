import java.util.Random;

class Solution {




    // Function to find the Kth largest element
    public int findKthLargest(int[] arr, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(); // Max heap

        // Maintain a max heap of size 'k'
        for (int ele : arr) {
            pq.add(ele); // Insert element into max heap

            // If heap size exceeds 'k', remove the largest element (top of the heap)
            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.peek();
    } 
}
