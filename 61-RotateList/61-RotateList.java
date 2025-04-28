// Last updated: 4/28/2025, 11:15:38 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)  return null;
        if(head.next==null) return head;
        int len = 0;
        ListNode curr = head;
        ListNode temp = head;
        ListNode later = null;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        k =k%len;
        if(k==0)    return head;
        int bob = len-k;
        
        for(int i=0;i<bob-1;i++){
            curr = curr.next;
        }
        later  = curr.next;
        curr.next = null;
        ListNode newHead = later;
        while(later.next!=null){
            later = later.next;
        }
        later.next = head;
        return newHead;
    }
}