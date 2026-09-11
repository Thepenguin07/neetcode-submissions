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
    public void reorderList(ListNode head) {
        if(head==null)return;
        ListNode f=head.next,s=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode c=s.next,p=null;
        s.next=null;
        while(c!=null){
            ListNode t=c.next;
            c.next=p;
            p=c;
            c=t;
        }
        ListNode first=head;
        while(p!=null){
            ListNode t1=first.next;
            ListNode t2=p.next;
            first.next=p;
            p.next=t1;
            p=t2;
            first=t1;
        }
    }
}
