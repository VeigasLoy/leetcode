// Last updated: 4/28/2025, 11:12:23 AM
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)  return null;
        
        while (head != null && head.val == val) {
            head = head.next;
        }    
        ListNode tmp = head;
        ListNode prev = head;

        while(prev!=null&&prev.next!=null){
            if(prev.next.next==null && prev.next.val==val){
                prev.next=null;
            }
            else if(prev.next.val==val){
                prev.next = prev.next.next;       
            } else
            prev = prev.next;
        }
        return tmp;
    }
}