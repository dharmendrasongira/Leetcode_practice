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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  ListNode  temp1 =l1;
  ListNode  temp2= l2;
  ListNode dummy= new ListNode (-1);
  ListNode ans = dummy;
  int carry=0;
while (temp1 !=null || temp2 !=null ){
    int val1=0;
    int val2=0;
    if (temp1!=null)val1 = temp1.val;
     if (temp2!=null)val2 = temp2.val;
    int num= val1 +val2 + carry;
    ListNode node = new ListNode (num%10);
    ans.next =node ;
   ans =  ans.next;
 if (temp1!=null)  temp1 =temp1.next;
  if (temp2!=null) temp2 =temp2.next;
   if ( num>9)carry=1;
   else carry=0;
   
}
if (carry ==1){
  ListNode node = new ListNode (1);  
   ans.next =node;
  ans= ans.next;  
}
return dummy.next;
        
    }
}