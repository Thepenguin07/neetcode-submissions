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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<List<Integer>> arr=new ArrayList<>();
        if(root==null)return arr;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                row.add(leftToRight ? row.size() : 0, r.val);
                if(r.left!=null)q.add(r.left);
                if(r.right!=null)q.add(r.right);
            }
                leftToRight=!leftToRight;
                arr.add(row);
            }
            return arr;
    }
}