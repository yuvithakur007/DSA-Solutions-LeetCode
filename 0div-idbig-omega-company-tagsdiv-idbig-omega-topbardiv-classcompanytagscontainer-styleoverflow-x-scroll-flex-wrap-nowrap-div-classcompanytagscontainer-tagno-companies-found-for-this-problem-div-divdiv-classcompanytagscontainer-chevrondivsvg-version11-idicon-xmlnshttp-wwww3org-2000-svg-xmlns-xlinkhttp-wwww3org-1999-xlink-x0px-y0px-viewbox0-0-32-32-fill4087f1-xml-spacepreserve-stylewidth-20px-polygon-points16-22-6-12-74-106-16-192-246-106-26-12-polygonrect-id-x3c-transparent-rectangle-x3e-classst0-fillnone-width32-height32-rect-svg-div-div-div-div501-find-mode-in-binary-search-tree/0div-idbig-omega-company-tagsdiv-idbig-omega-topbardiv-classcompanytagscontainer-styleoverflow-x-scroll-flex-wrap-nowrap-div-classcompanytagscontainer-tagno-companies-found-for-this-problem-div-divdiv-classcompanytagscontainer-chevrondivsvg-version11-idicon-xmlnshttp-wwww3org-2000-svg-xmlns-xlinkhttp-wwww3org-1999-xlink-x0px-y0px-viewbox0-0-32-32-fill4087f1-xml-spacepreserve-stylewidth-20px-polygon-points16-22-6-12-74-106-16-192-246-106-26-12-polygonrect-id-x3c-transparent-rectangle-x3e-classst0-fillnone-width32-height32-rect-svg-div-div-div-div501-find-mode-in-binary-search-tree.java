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
    public int[] findMode(TreeNode root) {
        int max = -1;
        int ima = 0;
        TreeNode pre = null;
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        List<Integer> proto = new ArrayList<Integer>();
        while (root != null || !toVisit.empty()) {
            if (root != null) {
                toVisit.push(root);
                root = root.left;
            }
            else {
                root = toVisit.pop();
                if (pre == null || pre.val != root.val) ima = 1;
                else ima++;
                if (ima > max) {
                    max = ima;
                    proto.clear();
                    proto.add(root.val);
                }
                else if (ima == max) proto.add(root.val);
                pre = root;
                root = root.right;
            }
        }
        int[] ret = new int[proto.size()];
        for (int i = 0; i < proto.size(); i++) ret[i] = proto.get(i);
        return ret;
    }
}