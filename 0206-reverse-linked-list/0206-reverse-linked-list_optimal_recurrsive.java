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
    public ListNode reverse(ListNode prev ,ListNode curr,ListNode up){
        curr.next = prev;
        if(up  == null) return curr;
        return  reverse(curr,up,up.next);
    }
    public ListNode reverseList(ListNode head) {
        if(head ==null )return null;
        if(head.next == null)return head;
        return reverse(null,head, head.next);
    }
}