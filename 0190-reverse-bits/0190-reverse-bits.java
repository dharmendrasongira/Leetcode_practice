public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        int i = 0;
        int j = 31;  // Since 32-bit integer, indices from 0 to 31
        
        while (i < j) {
            int imask = 1 << i; // Create mask for i-th bit
            int jmask = 1 << j; // Create mask for j-th bit
            
            // Check if i-th and j-th bits are ON (1) or OFF (0)
            boolean iOn = (n & imask) != 0;
            boolean jOn = (n & jmask) != 0;
            
            // If bits are different, we need to swap them
            if (iOn != jOn) {
                n ^= imask; // Flip i-th bit
                n ^= jmask; // Flip j-th bit
            }
            
            i++; // Move left pointer to the right
            j--; // Move right pointer to the left
        }
        
        return n; // Return the reversed bits result
    }
}
