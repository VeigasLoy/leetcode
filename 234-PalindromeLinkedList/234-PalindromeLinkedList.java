// Last updated: 4/28/2025, 11:11:58 AM
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
    public boolean isPalindrome(ListNode head) {
        ListNode tmp = head;
        Stack<Integer> s = new Stack<>();
        while(tmp!=null){
            s.push(tmp.val);
            tmp = tmp.next;
        }
        while(!s.isEmpty()){
            if(head.val!=s.pop())
                return false;
            head = head.next;
        }
        return true;
    }
}