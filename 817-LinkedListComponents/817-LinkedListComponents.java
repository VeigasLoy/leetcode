// Last updated: 4/28/2025, 10:37:39 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int vset;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int vset) { this.vset = vset; }
 *     ListNode(int vset, ListNode next) { this.vset = vset; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode tmp = head;
        int count = 0;
        while(tmp!=null){
            if(set.contains(tmp.val)){
                tmp =tmp.next;
                
                while(tmp!=null&&set.contains(tmp.val)){ 
                    tmp = tmp.next;
                }
                count++;
            }
            else
            tmp = tmp.next;
        }
        return count;
    }
}