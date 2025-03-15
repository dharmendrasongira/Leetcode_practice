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
 
    public TreeNode build(int[]arr,int left,int right){
          if(left>right) return null;
          int mid = left + (right - left) / 2;  
          TreeNode node = new TreeNode(arr[mid]);
          node.left=build(arr,left,mid-1);
          node.right=build(arr,mid+1,right);
         return node;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }
}