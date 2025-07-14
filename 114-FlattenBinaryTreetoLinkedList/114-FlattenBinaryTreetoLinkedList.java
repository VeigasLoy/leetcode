// Last updated: 7/14/2025, 12:21:18 PM
class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    // Use a class-level variable to keep track of the current node
    private static ListNode curr;

    public static void preorder(TreeNode root, ListNode dummy) {
        if (root == null)
            return;
        curr.next = new ListNode(root.val);
        curr = curr.next;
        preorder(root.left, dummy);
        preorder(root.right, dummy);
    }

    public ListNode helper(TreeNode root) {
        if (root == null) return null;
        ListNode head = new ListNode(-1);
        curr = head;
        preorder(root, head);
        // while(head.next!=null){
        //     System.out.println(head.next.val);
        //     head = head.next;
        // }
        return head.next; 
    }

    public void flatten(TreeNode root){
    if (root == null) return; 
    ListNode list = helper(root);

    root.val = list.val;
    root.left = null;
    list = list.next;

    while (list != null) {
        root.right = new TreeNode(list.val);
        root = root.right;
        root.left = null;
        list = list.next;
    }
}

}
