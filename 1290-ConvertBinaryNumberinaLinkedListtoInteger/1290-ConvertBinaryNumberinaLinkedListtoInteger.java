// Last updated: 7/14/2025, 9:22:46 AM
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
    public int getDecimalValue(ListNode head) {
        ListNode trav = head;
        int len = 0;
        while(trav!=null){
            len++;
            trav = trav.next;
        }
        // System.out.println(len);
        double num=0;
        while(head!=null){
            num = num + head.val*Math.pow(2,len-1);  
            len--; 
            head = head.next;
        }
        return (int)num;
    }
}