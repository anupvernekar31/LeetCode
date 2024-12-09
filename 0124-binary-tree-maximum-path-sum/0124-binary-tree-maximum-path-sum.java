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
    int maxiSum = Integer.MIN_VALUE;
    
    public int util(TreeNode root){
        if(root == null){
            return 0;
        
        }
       int lh = Math.max(0, util(root.left));
        int rh = Math.max(0, util(root.right));
        maxiSum = Math.max(maxiSum, lh+rh+root.val);
        return Math.max(lh,rh) + root.val;
    }
    
    public int maxPathSum(TreeNode root) {
        
        // int maxiSum = Integer.MIN_VALUE;
        util(root);
        return maxiSum;
        
    }
}