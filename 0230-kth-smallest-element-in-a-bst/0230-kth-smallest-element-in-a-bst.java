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
    private static int number = 0;
    private static int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        kthsmallest(root);
        return number;
    }

    private void kthsmallest(TreeNode root){
        if(root.left != null)   kthsmallest(root.left);

        count--;

        if(count == 0){
            number = root.val;
            return;
        }

        if(root.right != null)   kthsmallest(root.right);
    }

}