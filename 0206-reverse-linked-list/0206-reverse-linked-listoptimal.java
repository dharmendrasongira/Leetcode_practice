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
        if(head ==null )return null;
        if(head.next == null)return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode up = head.next;
        while(up != null){
            curr.next = prev;
            prev = curr;
            curr= up;
            up= up.next;
        }
            curr.next = prev;
        head = curr;
         return head;
    }
}