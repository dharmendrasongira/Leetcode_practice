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
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        // Recursively flatten left and right subtrees
        flatten(root.left);
        flatten(root.right);

        if (root.left != null) {
            TreeNode temp = root.left;
            while (temp.right != null) {  
                temp = temp.right;
            }
            temp.right = root.right;  // Attach original right subtree
            root.right = root.left;   // Move left subtree to the right
            root.left = null;         // Set left to null
        }
    }
}
