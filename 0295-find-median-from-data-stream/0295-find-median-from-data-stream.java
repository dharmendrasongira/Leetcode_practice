class MedianFinder {
  PriorityQueue <Integer>min = new PriorityQueue<>();
    PriorityQueue <Integer>max = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(max.size()==0)max.add(num);
       else{
        if(num<max.peek()) max.add(num);
        else min.add(num);
       }
       
       if(max.size()==min.size()+2){
          int top =max.remove();
          min.add(top);
       }
           
       if(min.size()==max.size()+2){
          int top =min.remove();
          max.add(top);
       }
        
    }
    
    
    public double findMedian() {
   if(max.size()==min.size()){
     return ((max.peek()+min.peek())/2.0);
   }
   else if(max.size()>min.size()){
   return max.peek();  
    }
    else return min.peek();

}
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */