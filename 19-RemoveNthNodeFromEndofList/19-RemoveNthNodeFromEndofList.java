// Last updated: 4/28/2025, 11:14:29 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)  return null;
        ListNode tmp = head;
        int len=0;
        while(tmp!=null){
            tmp =tmp.next;
            len++;
        }
        if(len==n){
            ListNode newHead = head.next;
            head.next = null;
            return newHead;
        }
        ListNode prev = head;
        ListNode curr = null;
        ListNode succ = null;
        for(int i=0;i<len-n-1;i++){
            prev = prev.next;
        }
        curr = prev.next;
        if(curr!=null){
            succ = curr.next;
            prev.next = succ;
        }
        curr.next = null;
        return head;
    }
}