// Last updated: 7/14/2025, 2:26:16 PM
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode oddHead = new ListNode(head.val);
        ListNode odd = oddHead;

        ListNode evenHead = new ListNode(head.next.val);
        ListNode even = evenHead;

        head = head.next.next;
        int i=0;
        while(head!=null){
            if(i%2==0){
                odd.next = new ListNode(head.val);
                odd = odd.next;
            }   else{
                    even.next = new ListNode(head.val);
                even = even.next;
            }
            head=head.next;
            i++;
        }
        odd.next=evenHead;
        return oddHead;
    }
}