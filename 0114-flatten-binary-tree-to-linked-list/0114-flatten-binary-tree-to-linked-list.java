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
    public TreeNode  pre(TreeNode root,List ans){
        if(root==null)return null;
          ans.add(root);
        pre(root.left,ans);
        pre(root.right,ans);
        return root;
    } 
    public void flatten(TreeNode root) {
       List<TreeNode> ans  = new ArrayList<>();

       pre( root, ans); 
       for(int i=0;i<ans.size();i++){
       TreeNode temp= ans.get(i);
              temp.left=null;
       if(i != ans.size()-1) temp.right=ans.get(i+1);

       }
   
    }
}