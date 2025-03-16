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
           
    public TreeNode helper( int[]preorder,int[] inorder ,int pl,int ph,int il,int ih){   
           if(pl>ph||il>ih) return null;

        int node=  preorder[pl];       
        TreeNode root= new TreeNode(node);
        int r=0;
          while(inorder[r] != node){
             r++;
          }
          int leftsize=r-il;
        
        root.left =helper(preorder,inorder,pl+1,pl+leftsize,il,r-1 );
        root.right =helper(preorder,inorder,pl+leftsize+1,ph,r+1,ih );
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
             int n=preorder.length;
            int[] nums = Arrays.copyOf(preorder,n); // C
        Arrays.sort(nums);  
   
        return helper(preorder,nums,0,n-1,0,n-1);

    }
}