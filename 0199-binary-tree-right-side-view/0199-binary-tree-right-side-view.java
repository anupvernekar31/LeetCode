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
    public void printRight(TreeNode current,int  level, List<Integer> ans){
        if(current == null) {
            return;
        }
        if(level == ans.size()) {
            ans.add(current.val);
        }
        printRight(current.right, level+1, ans);
        printRight(current.left, level+1, ans);
        
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer>  ans = new ArrayList<Integer>();
        printRight(root, 0, ans);
        return ans;
        
    }
}