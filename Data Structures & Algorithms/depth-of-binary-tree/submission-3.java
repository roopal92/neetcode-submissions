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
    public int maxDepth(TreeNode root) {
        // maintain row count on each level keeping track using Pair
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        //start with 0 not 1 bcz on pop we are incrementing by 1
        int res = 0;

        while (!stack.isEmpty()) {
            Pair<TreeNode,Integer> current=stack.pop();
            //get key n value frm Pair dont work on Pair
            TreeNode node=current.getKey();
            int row=current.getValue();
          
            if(node!=null){
                //choose max not row+1
                res=Math.max(res,row);
            stack.push(new Pair<>(node.left, row+1));
            stack.push(new Pair<>(node.right, row+1));
            }


        }
        return res;  
    }
}
