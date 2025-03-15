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
  private static void inorder(TreeNode root, List list) {  // Change node to Node
        if (root == null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }

    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> list =new ArrayList<>();
        inorder( root,  list);
        
 for (int i = list.size() - 1; i > 0; i--) {
    list.get(i - 1).val += list.get(i).val; // ✅ Sahi: Previous node ko update karna hai
}

    return root;
}}