/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node,Node> m=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        if(m.containsKey(head))return m.get(head);
        Node c=new Node(head.val);
        m.put(head,c);
        c.next=copyRandomList(head.next);
        c.random=copyRandomList(head.random);
        return c;
    }
}
