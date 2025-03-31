class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> ls =new ArrayList<>();

        for(int ele:stones){
            ls.add(ele);
        }

       while(ls.size()>1){
        Collections.sort(ls);
        int n= ls.size();
        int y= ls.remove(n-1);
        int x = ls.remove(n-2);
        if(x != y){
            ls.add(y-x);
        }
        }
          return ls.isEmpty() ? 0 : ls.get(0);
    }
}