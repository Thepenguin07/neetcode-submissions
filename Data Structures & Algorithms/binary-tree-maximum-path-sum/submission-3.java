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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
       return max;
    }
    int maxPath(TreeNode root) {
        if(root==null)return 0;
        int lsum=Math.max(maxPath(root.left),0);
        int rsum=Math.max(maxPath(root.right),0);
        max=Math.max(max,lsum+rsum+root.val);
        return root.val+Math.max(lsum,rsum);
    }
}
