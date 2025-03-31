class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> ls = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:stones){
            ls.add(ele);
        }

       while(ls.size()>1){
        int n= ls.size();
        int y= ls.remove();
        int x = ls.remove();
        if(x != y){
            ls.add(y-x);
        }
        }
          return ls.isEmpty() ? 0 : ls.peek();
    }
}