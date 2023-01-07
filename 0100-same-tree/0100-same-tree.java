/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        public boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null)
            return false;

        return ((node1.val == node2.val) && isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right));
    }
    
    
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     // recurision method
    //     if (p == null && q == null) return true;
    //     if (p == null && q != null || p != null && q == null) return false;
    //     if (p.val != q.val) return false;
    //     return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    // }
}