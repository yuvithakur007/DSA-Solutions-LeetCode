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
    int postIndex;
    public TreeNode constructBinaryTree(int[] inorder, int[] postorder, int is, int ie, HashMap<Integer, Integer> map) {
        if (is > ie) return null;
        TreeNode root = new TreeNode(postorder[postIndex]);
        int inIndex = map.get(root.val);
        postIndex -= 1;
        root.right = constructBinaryTree(inorder, postorder, inIndex + 1, ie, map);
        root.left = constructBinaryTree(inorder, postorder, is, inIndex - 1, map);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        TreeNode root = constructBinaryTree(inorder, postorder, 0, inorder.length - 1, map);
        return root;
    }
}