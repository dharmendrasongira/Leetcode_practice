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
    public  boolean exist(TreeNode temp,TreeNode k){
        if(temp==k)return true;
        if(temp== null) return false;
       return exist(temp.left,k)||exist(temp.right,k);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root ||q==root)return root;
     boolean pleft=exist(root.left,p);
     boolean qleft=exist(root.left,q);

      if(qleft==false && pleft ==true){ return root; }
      if(qleft==true && pleft ==false){ return root; }
      if(qleft==true && pleft ==true){ return lowestCommonAncestor(root.left, p,q); }
      if(qleft==false && pleft==false)return lowestCommonAncestor(root.right, p,q);





        
    
    return root;}
}