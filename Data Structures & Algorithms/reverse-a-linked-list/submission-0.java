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
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode p=null;
        ListNode q=head;
        while(q!=null){
            ListNode t=q.next;
            q.next=p;
            p=q;
            q=t;
        }
        return p;
    }
}
