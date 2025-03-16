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

    public TreeNode iop(TreeNode root){
     TreeNode Temp= root.left ;
     while(Temp.right != null){
        Temp=Temp.right;
     }
     return Temp;
    }

 public TreeNode parent(TreeNode root,TreeNode pred){

  if(root.left ==pred||root.right==pred)return root;
     TreeNode Temp= root.left;

     while(Temp.right != pred){
        Temp=Temp.right;
       
     }
      return Temp;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
          if (root == null) return null;
        if(root.val==key){
        if(root.left ==null && root.right==null){
            return null;     
        }
       else if(root.left ==null || root.right == null){
            if(root.left==null) return root.right;
            else return root.left;
        }
    else {
        TreeNode pred =iop(root);
        TreeNode predParent =parent(root,pred);

        if(root==predParent){
        pred.right=root.right; 
        return pred;
        }
        predParent.right=pred.left;
        pred.left=root.left;
        pred.right=root.right;
        return pred;

    }

        }


        else if(key<root.val){
            root.left = deleteNode(root.left,key);
      
        }
        else {
            root.right=deleteNode(root.right,key);
        }
        return root;
        
    }
}