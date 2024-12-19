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
    int counter = 0;
    int ans[] = new int[]{Integer.MAX_VALUE};
    

    private void inorder(TreeNode node, int k, int[] ans) {
        if (node == null || counter >= k) return;

        
        inorder(node.left, k, ans);

        // Increment counter after visiting left subtree
        counter++;
        System.out.println(counter);

        // Check if current node is the Kth smallest
        if (counter == k) {
             ans[0] = node.val;
            return ;
        }

        inorder(node.right, k, ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root, k, ans);
        return ans[0];
        
    }
}