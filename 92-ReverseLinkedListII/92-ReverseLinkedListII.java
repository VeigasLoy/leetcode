// Last updated: 4/28/2025, 10:38:59 AM
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode tmp = head;
        int pos=1;
        ListNode prevL = null; //node before left
        if(left!=1){
            while(tmp!=null && pos!=left-1){ //traverse until left
            tmp = tmp.next;
            pos++;
        }
        prevL = tmp;
        tmp = tmp.next;
        pos++;
        }
        Stack<ListNode> s = new Stack<>();
        ListNode node = tmp; //node after right
        while(node!=null && pos <=right){ //add all nodes to stack until right
            s.push(node);
            node = node.next;
            pos++;
        }
        ListNode revHead = s.pop();
        if(left!=1) prevL.next = revHead; //connects previous elements to the reversed sublist
        ListNode rev = revHead;
        while(!s.isEmpty()){
            rev.next = s.pop();
            rev = rev.next;
        }
        rev.next = node; //connects the new right to rest of the list
        if(left==1) return revHead;
        return head;

    }
}