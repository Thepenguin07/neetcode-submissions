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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d=new ListNode(-1,head);
        ListNode r=d;
        while(r.next!=null){
            if(r.next.val==val){
                r.next=r.next.next;
            }
            else
            r=r.next;
        }
        return d.next;
    }
}