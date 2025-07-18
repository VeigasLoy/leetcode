// Last updated: 7/14/2025, 1:28:37 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        while(curr!=null){
            curr.val = curr.next.val;
            if(curr.next.next==null){
                curr.next =null;
            }
            curr = curr.next;
        }
    }
}