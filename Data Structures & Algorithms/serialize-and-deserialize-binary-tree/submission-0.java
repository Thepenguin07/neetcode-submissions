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

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
     if(root==null)return "#,";
     return root.val+","+serialize(root.left)+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
     String v[]=data.split(",");
     int ind[]={0};
     return buildTree(ind,v);
    }
    TreeNode buildTree(int i[],
    String v[]){
      String val=v[i[0]];
      i[0]++;
      if(val.equals("#"))return null;
      TreeNode r=new TreeNode(Integer.parseInt(val));
      r.left=buildTree(i,v);
      r.right=buildTree(i,v);
      return r;
    }
}
