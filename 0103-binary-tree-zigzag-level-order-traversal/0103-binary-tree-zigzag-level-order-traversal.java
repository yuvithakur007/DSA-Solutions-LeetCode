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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> op = new LinkedList<>();
        if(root==null){
            return op;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean odd=true;
        while(!queue.isEmpty()) {
           int size = queue.size();
           LinkedList<Integer> res = new LinkedList<>();
           for(int i=1;i<=size;i++){
               TreeNode node = queue.poll();
               if(odd){
                   res.add(node.val);   
               } else {
                   res.addFirst(node.val);
               }
               if(node.left!=null) {
                       queue.add(node.left);
               }
            if(node.right!=null){
                        queue.add(node.right);
                   }
               
           }
            op.add(res);
            odd=!odd;
        }
        return op;
    }
}


// class Solution {
//     public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> res = new ArrayList<>();
//         if(root == null) 
//             return res;
//         //The offer() operation is used to insert new element into the queue. If it performs insert operation successfully, it returns “true” value. Otherwise it returns “false” value.
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root); 
//         int level = 0; // the number of level !!
//         while(!queue.isEmpty()) {
//             List<Integer> list = new ArrayList<>();
//             int size = queue.size();
//             for(int i=0; i<size; i++) {
//                 TreeNode node = queue.poll();
//                 list.add(node.val);
//                 if(node.left != null) queue.offer(node.left);
//                 if(node.right != null) queue.offer(node.right);
//             }
//             if(level % 2 == 1) { //reverse data
//                 Collections.reverse(list);
//             }
//             res.add(list);

//             level++; // after traverse all member of element in same level, go next level
//         }
//         return res;
//     }
// }