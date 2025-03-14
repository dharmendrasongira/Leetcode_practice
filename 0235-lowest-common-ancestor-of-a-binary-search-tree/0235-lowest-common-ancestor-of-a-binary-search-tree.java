/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
 
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(p==root ||q==root)return root;
        if(p.val < root.val && q.val > root.val) return root;
        if(q.val < root.val && q.val > root.val) return root;
         
        TreeNode left=lowestCommonAncestor(root.left, p, q);
             if(p.val < root.val && q.val <root.val) return left;
        TreeNode right =lowestCommonAncestor(root.right, p, q);
            if(p.val > root.val && q.val > root.val) return right;


        
    
    return root;}
}