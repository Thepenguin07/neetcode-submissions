/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node=head;
        for(int i=0;i<k;i++){if(node==null)return head;node=node.next;}
        ListNode h=reverseKGroup(node,k);
        ListNode c=head,p=h;
       for(int i=0;i<k;i++){
            ListNode t=c.next;
            c.next=p;
            p=c;
            c=t;
        }
        return p;
    }
}
