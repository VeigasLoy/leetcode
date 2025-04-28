// Last updated: 4/28/2025, 11:10:34 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)  return null;
        ListNode tmp = head;
        Map<Integer,Integer> map = new TreeMap<>();
        while(tmp!=null){
            map.put(tmp.val,map.getOrDefault(tmp.val,0)+1);
            tmp = tmp.next;
        }
        ListNode list = null;
        ListNode newHead = null;
        for(Map.Entry<Integer,Integer> ele: map.entrySet()){
            int key = ele.getKey();
            int val = ele.getValue();
            if (val == 1) {
                ListNode newNode = new ListNode(key);

                if(newHead == null){
                    newHead = newNode;
                    list = newNode;
                } else{
                    list.next = newNode;  
                    list = list.next;   
                }
            }
        }
        return newHead;
    }
}