package LeetCode_solution;

public class Sorted_LinkedList_To__BST {
    /*
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return helper(head, null);
    }
    public TreeNode helper(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;

        while(fast!=tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(slow.val);
        node.left = helper(head, slow);
        node.right = helper(slow.next, tail);
        return node;
    }

     */
}
