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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 1, x = 1;
        int max = Integer.MIN_VALUE;
        while(q.size() != 0) {
            int s = q.size();
            int y = 0;
            while(s-- > 0) {
                TreeNode z = q.poll();
                y += z.val;
                
                if(z.left != null) {
                    q.add(z.left);
                }
                if(z.right != null) {
                    q.add(z.right);
                }
            }
            if(y > max) {
                level = x;
                max =  y;
            }
            x++;
        }
        return level;
    }
}