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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p=d;
        for(int i=0;i<left-1;i++)p=p.next;
        ListNode sublisth=p.next,sublistt=sublisth;
        for(int i=0;i<right-left;i++)sublistt=sublistt.next;
        ListNode nextn=sublistt.next;
        sublistt.next=null;
        p.next=rev(sublisth);
        sublisth.next=nextn;
        return d.next;

    }
    ListNode rev(ListNode head){
    ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
        }
return prev;
    }
}