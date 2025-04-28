// Last updated: 4/28/2025, 10:40:05 AM
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
        ListNode newNode = new ListNode();
        int sum = (l1.val + l2. val) % 10;
        newNode = new ListNode(sum);
        int val1 = 0, val2 = 0;
        int carry = (l1.val + l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode newHead = newNode;
        while(l1!=null||l2!=null){
            val1 = (l1 != null) ? l1.val : 0;
            val2 = (l2 != null) ? l2.val : 0;
            sum = val1 + val2 + carry;
            newNode.next = new ListNode(sum%10);
            carry = (sum)/10;
            newNode = newNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry > 0){
            newNode.next = new ListNode(carry);
            newNode = newNode.next;
        }
        newNode.next = null;
        return newHead;
    }
}