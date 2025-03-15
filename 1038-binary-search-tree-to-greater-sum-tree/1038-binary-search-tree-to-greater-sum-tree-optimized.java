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
    static int sum;
  private static void inorder(TreeNode root) {  // Change node to Node
        if (root == null) return;
         inorder(root.right);
         root.val +=sum;
         sum=root.val;
     inorder(root.left);
    }

    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        inorder( root);
    return root;
}}