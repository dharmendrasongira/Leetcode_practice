class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];  // s -> t mapping
        int[] brr = new int[256];  // t -> s mapping
        int n = s.length();
        Arrays.fill(arr, -1);
        Arrays.fill(brr, -1);
        
        for (int i = 0; i < n; i++) {
            int idx = (int)s.charAt(i);
            int bdx = (int)t.charAt(i);
            
            if (arr[idx] != -1 && arr[idx] != bdx) {
                return false;
            }
            if (brr[bdx] != -1 && brr[bdx] != idx) {
                return false;
            }
            
            arr[idx] = bdx;
            brr[bdx] = idx;
        }
        
        return true;
    }
}
