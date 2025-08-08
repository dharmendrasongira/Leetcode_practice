/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack <ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp != null ){
              st.push(temp);
            temp = temp.next;
          
        }
          head = st.pop();
          ListNode tempq = head;
        while(!st.isEmpty()){
            tempq.next =st.pop();
            tempq= tempq.next;
        }
             tempq.next = null;
        return head;
   }
}
        
    