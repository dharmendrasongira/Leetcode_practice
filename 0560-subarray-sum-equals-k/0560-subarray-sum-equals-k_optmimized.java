class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = (nums[i] + nums[i - 1]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ele =nums[i];
            if (ele == k)
                count++;
                int rem = nums[i] - k;
                  if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else{
                map.put(nums[i], map.get(ele) + 1);}
           
          

        }
        return count;

    }
}