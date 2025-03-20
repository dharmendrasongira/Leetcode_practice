class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer> map = new HashMap<>();
       HashSet<Integer> set = new HashSet<>();

      for(int i=0;i<arr.length;i++){
            int  k=1;
            if(map.containsKey(arr[i])){
            k= map.get(arr[i])+1;

            }
               map.put(arr[i], k); 

        }
        for(int val :map.values()){
         set.add(val);
        }
        if (set.size() != map.size()) return false;

        return true;
    }
}