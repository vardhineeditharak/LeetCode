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
        int MaxDepth = md(root, 0);

        return MaxDepth;
    }

    private int md(TreeNode node, int d){
        if(node == null)    return 0;

        return 1 + Math.max(md(node.left, d), md(node.right , d));
    }
}