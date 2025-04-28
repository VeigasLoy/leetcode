// Last updated: 4/28/2025, 11:12:39 AM
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
        if(head==null)  return null;
        ListNode tmp = head;
        Stack<ListNode> s = new Stack<>();
        while(tmp!=null){
            s.push(tmp);
            tmp = tmp.next;
        }

        ListNode newHead = s.pop();
        ListNode list = newHead;

        while (!s.isEmpty()) {
            list.next = s.pop();
            list = list.next;
        }

        list.next = null; 
        return newHead;
    }
}