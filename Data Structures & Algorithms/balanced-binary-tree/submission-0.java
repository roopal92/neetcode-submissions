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

//We can use the Depth First Search (DFS) algorithm to compute the heights at each node. While calculating the heights of the left and right subtrees, we also check if the tree rooted at the current node is balanced. If leftHeight - rightHeight > 1, we update a global variable, such as isBalanced = False. After traversing all the nodes, the value of isBalanced indicates whether the entire tree is balanced or not.
class Solution {
    
    public boolean isBalanced(TreeNode root) {
        return dfs(root) !=-1;
    }

    private int dfs(TreeNode root){
        if(root==null) return 0;

        int l= dfs(root.left);
   
        int r= dfs(root.right);
      
        //missed first but here check r and l also and check absolute value
        if(Math.abs(l-r)>1 || l==-1  ||r==-1 )
            return -1;

        return 1+Math.max(l,r);

    }
}
