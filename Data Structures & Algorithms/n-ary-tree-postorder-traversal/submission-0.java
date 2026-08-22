/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    ArrayList<Integer> arr;
    public List<Integer> postorder(Node root) {
        arr=new ArrayList<>();
        dfs(root);
        return arr;
    }
    void dfs(Node root){
        if(root==null)return;
        for(Node c:root.children)
        dfs(c);
        arr.add(root.val);
    }
}