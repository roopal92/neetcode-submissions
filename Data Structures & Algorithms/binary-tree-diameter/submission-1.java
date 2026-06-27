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
    int val=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return val;
    }

    private int dfs(TreeNode root){

        if(root==null)return 0;

        int l=dfs(root.left);
        int r=dfs(root.right);
        //// Diameter passing through current node
        val=Math.max(val, l+r);
        //return height of current subtree
        return 1+Math.max(l,r);
    }
}
