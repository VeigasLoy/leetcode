// Last updated: 7/24/2025, 8:44:03 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)  return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head = new ListNode(0);
        ListNode merged = head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                merged.next = list1;
                list1 = list1.next;
            }   else{
                        merged.next = list2;
                        list2 = list2.next;
            }
            merged = merged.next;
        }
        merged.next = (list1 != null) ? list1 : list2;
        return head.next;
    }
}